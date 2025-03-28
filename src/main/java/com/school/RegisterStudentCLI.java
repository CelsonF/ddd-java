package com.school;

import com.school.application.indication.student.register.RegisterStudent;
import com.school.application.indication.student.register.RegisterStudentDTO;
import com.school.infrastructure.student.RepositoryStudentsMemory;

public class RegisterStudentCLI {
    public static void main(String[] args) {
        String name = "Celson Fernando Rodrigues de Araujo";
        String cpf = "123.456.789-00";
        String email = "celson-araujo97@hotmail.com";

        RegisterStudent register = new RegisterStudent(new RepositoryStudentsMemory());
        register.registerStudent(new RegisterStudentDTO(name, cpf, email));

    }
}
