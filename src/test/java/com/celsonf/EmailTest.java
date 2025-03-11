package com.celsonf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmailTest {

    @Test
    void testing_invalid_emails() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Email(null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Email("");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Email("invalid_email");
        });
    }

    @Test
    void testing_success_email() {
        Email email = new Email("email@email.com");

    }

}