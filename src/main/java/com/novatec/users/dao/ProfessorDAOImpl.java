package com.novatec.users.dao;

import com.novatec.users.entity.Professor;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfessorDAOImpl implements ProfessorDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Professor> getAllProfessor() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Professor> theQuery = currentSession.createQuery("FROM Professor", Professor.class);

        List<Professor> professors = theQuery.getResultList();

        return professors;
    }

    @Override
    public void saveProfessor(Professor professor) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(professor);
    }
}
