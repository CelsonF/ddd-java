package com.celsonf;

public class Telefone {

    private String numero;
    private String ddd;

    public Telefone(String ddd,String numero) {
        if (!numero.matches("\\d{8}|\\d{9}")) {
            throw new IllegalArgumentException("Numero deve conter 8 digitos");
        }

        if (ddd.length() != 2) {
            throw new IllegalArgumentException("Numero deve conter 2 digitos");
        }

        this.numero = numero;
        this.ddd = ddd;
    }

}
