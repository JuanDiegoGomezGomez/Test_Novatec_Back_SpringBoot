package com.novatec.users.controller;

import com.novatec.users.entity.Professor;
import com.novatec.users.entity.Student;
import com.novatec.users.service.ProfessorService;
import com.novatec.users.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    private StudentService studentService;
    @Autowired
    private ProfessorService professorService;

    @CrossOrigin
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @CrossOrigin
    @GetMapping("/professors")
    public List<Professor> getProfessors(){
        return professorService.getAllProfessors();
    }

    @CrossOrigin
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @CrossOrigin
    @PostMapping("/professor")
    public  Professor createProfessor(@RequestBody Professor professor){
        professorService.saveProfessor(professor);
        return professor;
    }
}
