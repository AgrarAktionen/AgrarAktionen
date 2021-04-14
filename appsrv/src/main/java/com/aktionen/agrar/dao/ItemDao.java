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

      /*      EntityManagerFactory emf = Persistence.createEntityManagerFactory("TDEMSPU");
            em = emf.createEntityManager();


            em.getTransaction().begin();

            List<Item> itemList = items;
            for (Iterator<Item> it = itemList.iterator(); it.hasNext();) {
                Item enquiry = it.next();

                em.persist(enquiry);
                em.flush();
                em.clear();
            }
*/

            for(Item item:items){
                em.merge(item);
                em.flush();
            }
        }


    public List<Item> all() {
        return em.createQuery("select i from Item i ", Item.class).getResultList();
    }

    public Item findById(int id) {
        return em.find(Item.class, id);
    }

    public Item save(@NotNull Item item) {
        return em.merge(item);
    }
    public Item get(int id) {
        return em.find(Item.class, id);
    }

    public void remove(Item item) {
        em.remove(item);
    }

}

