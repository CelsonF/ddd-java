package com.school.application.student.register;

import com.school.application.indication.student.register.RegisterStudent;
import com.school.application.indication.student.register.RegisterStudentDTO;
import com.school.domain.student.Cpf;
import com.school.domain.student.Student;
import com.school.infrastructure.student.RepositoryStudentsMemory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RegisterStudentCLITest {

    @Test
    void studentWillBePersisted() {
        RepositoryStudentsMemory repositoryStudentsMemory = new RepositoryStudentsMemory();
        RegisterStudent useCase = new RegisterStudent(repositoryStudentsMemory);

        RegisterStudentDTO studentData  = new RegisterStudentDTO(
                "Celson Fernando",
                "123.456.789-00",
                "celson@email.com");
        useCase.execute(studentData);

        Student findedStudent =  repositoryStudentsMemory.searchCpf(new Cpf("123.456.789-00"));

        assertEquals("Celson Fernando", findedStudent.getName());
        assertEquals("123.456.789-00", findedStudent.getCpf());
        assertEquals("celson@email.com", findedStudent.getEmail());

    }
}