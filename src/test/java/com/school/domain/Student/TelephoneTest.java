package com.school.Student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelephoneTest {

    @Test
    void testing_invalid_telephone() {

        assertThrows(IllegalArgumentException.class, () -> {
           new Telephone(null,null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
           new Telephone("1","1234567");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telephone("","1234567");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telephone("11","");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Telephone("1","12345678");
        });

    }

    @Test
    void testing_valid_telephone() {
        String ddd = "31";
        String number = "33859611";

        var telephone = new Telephone(ddd, number);

        assertEquals(ddd, telephone.getDdd());
        assertEquals(number, telephone.getNumber());


    }

}