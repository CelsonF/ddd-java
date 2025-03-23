package com.school.domain.student;

public class NotFountStudent extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotFountStudent(Cpf cpf) {
        super("Not found student with this cpf: " + cpf.getCpf());
    }
}
