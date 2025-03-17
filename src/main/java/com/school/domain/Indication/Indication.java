package com.school.Indication;

import com.school.Student.Student;

import java.time.LocalDateTime;

public class Indication {

    private Student indicado;
    private Student indicante;
    private LocalDateTime dataInicio;

    public Indication(Student indicado, Student indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dataInicio = LocalDateTime.now();
    }

    public Student getIndicante() {
        return indicante;
    }

    public Student getIndicado() {
        return indicado;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

}
