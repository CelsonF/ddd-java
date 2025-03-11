package com.school.Student;

public class Telephone {

    private String number;
    private String ddd;

    public Telephone(String ddd, String number) {
        if (ddd == null || number == null ) {
            throw new IllegalArgumentException("DDD and number are required");
        }

        if (!number.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Number required 8 digits");
        }

        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD required 2 digits");
        }

        this.number = number;
        this.ddd = ddd;
    }

    public String getNumber() {
        return number;
    }

    public String getDdd() {
        return ddd;
    }
}
