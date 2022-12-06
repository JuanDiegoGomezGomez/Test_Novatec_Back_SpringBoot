package com.novatec.users.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idStudent;

    @Column(name = "name")
    private String nameStudent;

    @Column(name = "email")
    private String emailStudent;

    public Student() {
    }

    public Student(int idStudent, String nameStudent, String emailStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", emailStudent='" + emailStudent + '\'' +
                '}';
    }
}
