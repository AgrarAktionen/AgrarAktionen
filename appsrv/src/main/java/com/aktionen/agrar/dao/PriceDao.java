package com.aktionen.agrar.dao;

import com.aktionen.agrar.model.Item;
import com.aktionen.agrar.model.Price;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.validation.constraints.NotNull;
import java.util.List;

@Named
@Dependent
public class PriceDao {
    @Inject
    EntityManager em;

    public void insertAll(List<Price> prices){
        for(Price price:prices){
            em.merge(price);
            em.flush();
        }
    }

    public List<Price> getAll() {return em.createQuery("select p from Price p ", Price.class).getResultList();}

    public Price add(@NotNull Price price) {
        return em.merge(price);
    }

    public Price get(int id) {
        return em.find(Price.class, id);
    }

    public void delete(Price price) {
        em.remove(price);
    }

}
