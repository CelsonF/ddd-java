package com.school.application.indication.student.register;

import com.school.domain.student.Student;
import com.school.domain.student.StudentRepository;

public class RegisterStudent {

    private final StudentRepository studentRepository;

    public RegisterStudent(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void execute(RegisterStudentDTO dataStudent) {
        Student student = dataStudent.createStudent();
        studentRepository.register(student);
    }

}
