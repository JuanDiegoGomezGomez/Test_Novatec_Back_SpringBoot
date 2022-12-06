package com.novatec.users.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="professor")
public class Professor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idProfessor;

    @Column(name = "name")
    private String nameProfessor;

    @Column(name = "email")
    private String emailProfessor;

    public Professor() {
    }

    public Professor(int idProfessor, String nameProfessor, String emailProfessor) {
        this.idProfessor = idProfessor;
        this.nameProfessor = nameProfessor;
        this.emailProfessor = emailProfessor;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNameProfessor() {
        return nameProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", nameProfessor='" + nameProfessor + '\'' +
                ", emailProfessor='" + emailProfessor + '\'' +
                '}';
    }
}
