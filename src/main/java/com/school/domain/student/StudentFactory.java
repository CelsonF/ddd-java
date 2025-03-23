package com.school.domain.student;

public class StudentFactory {

    private Student student;

    public StudentFactory withNameCpfEmail(String name,String cpf, String email) {
        this.student = new Student(name, new Cpf(cpf), new Email(email));
        return this;
    }

    public StudentFactory withTelephone(String ddd, String number) {
        this.student.AddTelephone(ddd,number);
        return this;
    }

    public Student create() {
        return this.student;
    }

}
