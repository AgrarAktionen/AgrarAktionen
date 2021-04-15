package com.aktionen.agrar.dao;

import at.htl.quarkus.demo.model.School;
import com.aktionen.agrar.model.Item;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.validation.constraints.NotNull;
import java.util.List;

@Named
@Dependent
public class ItemDao {
    @Inject
    EntityManager em;

        public void insertAll(List<Item> items){
            for(Item item:items){
                em.merge(item);
                em.flush();
            }
        }


    public List<Item> getAll() {
        return em.createQuery("select i from Item i ", Item.class).getResultList();
    }

    public Item findById(int id) {
        return em.find(Item.class, id);
    }

    public Item add(@NotNull Item item) {
        return em.merge(item);
    }
    public Item get(int id) {
        return em.find(Item.class, id);
    }

    public void delete(Item item) {
        em.remove(item);
    }

}

