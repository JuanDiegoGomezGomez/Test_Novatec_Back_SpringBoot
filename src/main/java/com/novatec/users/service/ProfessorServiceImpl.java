package com.novatec.users.service;

import com.novatec.users.dao.ProfessorDAO;
import com.novatec.users.entity.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements ProfessorService{

    @Autowired
    private ProfessorDAO professorDAO;

    @Override
    public List<Professor> getAllProfessors() {
        List<Professor> professorsList= professorDAO.getAllProfessor();
        return professorsList;
    }

    @Override
    public void saveProfessor(Professor professor) {
        professorDAO.saveProfessor(professor);
    }
}
