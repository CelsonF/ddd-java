package com.school.domain.student;

import java.util.List;

public interface StudentRepository {

        void register(Student student);

        Student searchCpf(Cpf cpf);

        List<Student> listAllStudentsEnrolled();

}
