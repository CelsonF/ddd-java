package com.school.Student;

public class Cpf {

    private String cpf;

    public Cpf(String cpf) {
        String regex = "(\\d{3})[.\\s]?(\\d{3})[.\\s]?(\\d{3})[-\\s]?(\\d{2})";

        if (cpf == null || !cpf.matches(regex)) {
            throw new IllegalArgumentException("Invalid CPF");
        }

        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
