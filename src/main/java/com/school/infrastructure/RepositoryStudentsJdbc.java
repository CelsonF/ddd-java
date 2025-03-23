package com.school.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.school.domain.student.*;

public class RepositoryStudentsJdbc implements StudentRepository {

    private final Connection connection;

    public RepositoryStudentsJdbc(Connection connection) {
        this.connection = connection;
    }

   @Override
    public void register(Student student) {
        try {
            String sql = "INSERT INTO STUDENT VALUES(?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, student.getCpf());
            ps.setString(2, student.getName());
            ps.setString(3, student.getEmail());
            ps.execute();

            sql = "INSERT INTO TELEPHONE VALUES(?, ?)";
            ps = connection.prepareStatement(sql);
            for (Telephone telephone: student.getTelephones()) {
                ps.setString(1, telephone.getDdd());
                ps.setString(2, telephone.getNumber());
                ps.execute();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }  
    }

    @Override
    public Student searchCpf(Cpf cpf) {
        try {
            String sql = "SELECT id, name, email FROM STUDENT WHERE cpf = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1,cpf.getCpf());

            ResultSet rs = ps.executeQuery();

            boolean found = rs.next();

            if (!found) {
                throw new NotFountStudent(cpf);
            }

            String name = rs.getString("name");
            Email email =  new Email(rs.getString("email"));
            Student foundStudent = new Student(name, cpf , email);

            Long id = rs.getLong("id");
            sql = "SELECT ddd, number FROM TELEPHONE WHERE student_id = ?";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String ddd = rs.getString("ddd");
                String number = rs.getString("number");
                foundStudent.AddTelephone(ddd, number);
            }

            return foundStudent;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        // TODO Auto-generated method stub
        return null;
    }

}
