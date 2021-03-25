package com.aktionen.agrar.rest;

import at.htl.quarkus.demo.dao.PersonDao;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("html")
@Produces(MediaType.TEXT_HTML)
public class HelloResource {
    @Inject
    PersonDao personDao;

    @Inject
    Template persontable;

    @GET
    @Path("persons")
    public TemplateInstance persons() {
        return persontable.data("persons", personDao.getAll());
    }
}
