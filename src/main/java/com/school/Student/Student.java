package com.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private Cpf cpf;
    private Email email;
    private List<Telephone> telephones = new ArrayList<>();


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

    public Cpf getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

}
