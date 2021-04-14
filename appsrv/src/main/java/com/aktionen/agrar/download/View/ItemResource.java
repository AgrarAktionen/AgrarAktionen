package com.aktionen.agrar.download.View;

import at.htl.quarkus.demo.dao.SchoolDao;
import at.htl.quarkus.demo.model.School;
import com.aktionen.agrar.dao.ItemDao;
import com.aktionen.agrar.model.Item;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("school")
@Produces(MediaType.APPLICATION_JSON)
@Transactional

public class ItemResource {

    @Inject
    ItemDao itemDao;

    @GET
    @Path("/")
    public List<Item> all() {
        return itemDao.all();
    }
    @Path("/{id:[0-9]+}")
    @GET
    public Item getItem(@PathParam("id") int id) {
        return itemDao.findById(id);
    }
}

