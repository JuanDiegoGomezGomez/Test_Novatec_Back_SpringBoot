package com.novatec.users.service;

import com.novatec.users.dao.StudentDAO;
import com.novatec.users.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDAO studentDAO;

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentsList= studentDAO.getAllStudents();
        return studentsList;
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }
}
