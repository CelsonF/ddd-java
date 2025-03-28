package com.school.application.indication.student.register;

import com.school.domain.student.Cpf;
import com.school.domain.student.Email;
import com.school.domain.student.Student;

public class RegisterStudentDTO {

    private String nameStudent;
    private String cpfStudent;
    private String emailStudent;

    public RegisterStudentDTO(String nameStudent, String cpfStudent, String emailStudent) {
        this.nameStudent = nameStudent;
        this.cpfStudent = cpfStudent;
        this.emailStudent = emailStudent;
    }

    public Student createStudent() {
        return new Student(
                nameStudent,
                new Cpf(cpfStudent),
                new Email(emailStudent));
    }
}
