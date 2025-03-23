package com.school.domain.student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private Email email;
    private String name;
    private Cpf cpf;

    private List<Telephone> telephones = new ArrayList<>();

    private String password;


    public Student(String name, Cpf cpf, Email email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public void AddTelephone(String ddd, String number) {
        this.telephones.add(new Telephone(ddd, number));
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf.getCpf();
    }

    public String getEmail() {
        return email.getEmail();
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

}
