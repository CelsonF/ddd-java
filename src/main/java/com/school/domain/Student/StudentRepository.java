package com.school.domain.Student;

public interface RepositoryStudent {

    void register(Student student);

    Student searchCpf(Cpf cpf);

    List<Student> listAllStudentsEnrolled();

}