package com.aktionen.agrar.dao;

import at.htl.quarkus.demo.model.Bill;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import java.util.List;

@Named
@Dependent
public class BillDao {
    @Inject
    EntityManager em;

    public List<Bill> getAll() {
        return em.createQuery("select b from Bill b", Bill.class).getResultList();
    }
    public Bill get(int id) {
        return em.find(Bill.class, id);
    }
    public Bill save(Bill bill) {
        return em.merge(bill);
    }
    public void delete(Bill bill) {
        em.remove(bill);
    }
}
//for commit