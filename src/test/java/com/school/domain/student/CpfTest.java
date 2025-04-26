package com.school.domain.student;

import com.school.domain.student.Cpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CpfTest {

    @Test
    void testing_dont_get_create_cpf() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Cpf("");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Cpf(null);
        });

    }

    @Test
    void testing_get_cpf() {
        String number = "123.456.789-01";
        var cpf = new Cpf(number);

        assertEquals(number, cpf.getCpf());
    }
}