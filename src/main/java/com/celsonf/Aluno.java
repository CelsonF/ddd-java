package com.celsonf;

import java.util.List;

public class Aluno {

    private String nome;
    private Cpf cpf;

    private Email email;

    private static List<Telefone> telefones;


    public void AddTelephone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }
}
