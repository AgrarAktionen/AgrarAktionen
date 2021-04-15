package com.aktionen.agrar.rest;


import com.aktionen.agrar.dao.PriceDao;
import com.aktionen.agrar.model.Price;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Transactional
@Produces(MediaType.APPLICATION_JSON)
@Path("price")
public class PriceResource {

    @Inject
    PriceDao priceDao;

    @GET
    public List<Price> all() {return priceDao.getAll();}




}
