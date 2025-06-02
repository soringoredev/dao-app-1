package com.example.crud_app.dao;

import com.example.crud_app.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImplementation implements StudentDAO {


    private EntityManager entityManager;

    @Autowired
    public StudentDAOImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    // comentariu
    @Override
    @Transactional
    public void save(Student theStudent) {

    }

}
