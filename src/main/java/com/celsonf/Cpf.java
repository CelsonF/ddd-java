package com.celsonf;

public class Cpf {

    private String cpf;

    public String getCpf(String cpf) {
        String regex = "(\\d{3})[.\\s]?(\\d{3})[.\\s]?(\\d{3})[-\\s]?(\\d{2})";

        if (cpf.length() != 11 || cpf.matches(regex)) {
            throw new IllegalArgumentException("Invalid CPF");
        }

        return cpf;
    }

}
