package com.aktionen.agrar.dao;

import at.htl.quarkus.demo.model.School;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@Dependent
public class SchoolDao {
    @Inject
    EntityManager em;
    public List<com.aktionen.agrar.model.School> all() {
        return em.createQuery("select s from School s", com.aktionen.agrar.model.School.class).getResultList();
    }

    public com.aktionen.agrar.model.School findById(int id) {
        return em.find(com.aktionen.agrar.model.School.class, id);
    }
}


//do woa da waidi
//hallo i woa a zweits moi do