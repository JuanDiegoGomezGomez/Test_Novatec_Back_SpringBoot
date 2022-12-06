package com.novatec.users.service;

import com.novatec.users.entity.Professor;

import java.util.List;

public interface ProfessorService {

    public List<Professor> getAllProfessors();

    public void saveProfessor(Professor professor);

}
