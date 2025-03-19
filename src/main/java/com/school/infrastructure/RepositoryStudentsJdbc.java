package com.school.infrastructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.school.domain.Student.Cpf;
import com.school.domain.Student.List;
import com.school.domain.Student.RepositoryStudent;
import com.school.domain.Student.Student;
import com.school.domain.Student.Telephone;

public class RepositoryStudentsJdbc implements RepositoryStudent {

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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        // TODO Auto-generated method stub
        return null;
    }

}
