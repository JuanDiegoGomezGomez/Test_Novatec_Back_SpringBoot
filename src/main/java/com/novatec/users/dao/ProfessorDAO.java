package com.novatec.users.dao;

import com.novatec.users.entity.Professor;

import java.util.List;

public interface ProfessorDAO {

    public List<Professor> getAllProfessor();

    public void saveProfessor(Professor professor);


}
