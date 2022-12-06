package com.novatec.users.dao;

import java.util.List;

import com.novatec.users.entity.Student;

public interface StudentDAO {

    public List<Student> getAllStudents();

    public void saveStudent(Student student);


}
