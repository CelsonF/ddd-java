package com.celsonf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void testing_invalid_telefone() {

        assertThrows(IllegalArgumentException.class, () -> {
           new Telefone("1","1234567");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("","1234567");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("11","");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("1","12345678");
        });
    }

    @Test
    void testing_valid_telefone() {

        Telefone telefone = new Telefone("11","12345678");

    }

}