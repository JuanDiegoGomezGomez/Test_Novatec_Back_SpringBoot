package com.novatec.users.service;

import com.novatec.users.entity.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudents();

    public void saveStudent(Student student);

}
