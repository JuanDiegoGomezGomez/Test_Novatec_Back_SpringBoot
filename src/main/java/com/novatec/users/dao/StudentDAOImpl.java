package com.novatec.users.dao;

import com.novatec.users.entity.Student;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> getAllStudents() {
        Session currentSession = entityManager.unwrap(Session.class);

        Query<Student> theQuery = currentSession.createQuery("FROM Student", Student.class);

        List<Student> students = theQuery.getResultList();

        return students;
    }

    @Override
    public void saveStudent(Student student) {
        Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(student);
    }
}
