package com.school.infrastructure;

import com.school.domain.student.Cpf;
import com.school.domain.student.NotFountStudent;
import com.school.domain.student.Student;
import com.school.domain.student.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryStudentsMemory  implements StudentRepository {

    private List<Student> students = new ArrayList<Student>();

    @Override
    public void register(Student student) {
        this.students.add(student);
    }

    @Override
    public Student searchCpf(Cpf cpf) {
        return this.students.stream()
                .filter(student -> student.getCpf().equals(cpf.getCpf()))
                .findFirst()
                .orElseThrow(() -> new NotFountStudent(cpf));
    }

    @Override
    public List<Student> listAllStudentsEnrolled() {
        return this.students;
    }
}
