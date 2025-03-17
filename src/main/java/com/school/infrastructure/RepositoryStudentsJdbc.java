package com.school.infrastructure;

import com.school.domain.Student.Cpf;
import com.school.domain.Student.List;
import com.school.domain.Student.RepositoryStudent;
import com.school.domain.Student.Student;

public class RepositoryStudentsJdbc implements RepositoryStudent {

    private final Connection connection;

    public RepositoryStudentsJdbc(Connection connection) {
        this.connection = connection;
    }

   @Override
    public void register(Student student) {
        
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
