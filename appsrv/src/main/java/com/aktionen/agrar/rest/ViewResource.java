package com.aktionen.agrar.rest;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;


import com.aktionen.agrar.dao.ItemDao;
import com.aktionen.agrar.download.CsvDownloader;
import com.aktionen.agrar.model.Item;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import java.io.FileNotFoundException;
import java.util.List;

@Transactional
@Path("view")
public class ViewResource {

    CsvDownloader csvDownloader = new CsvDownloader();

    @Inject
    Template view;

    @Inject
    ItemDao itemDao;

    @PUT
    @Path("viewInsert")
    public void insertData() throws FileNotFoundException {
        List<Item> items = csvDownloader.createItemList();
        itemDao.insertAll(items);
    }


    @GET
    public TemplateInstance templateInstance() {
        List<Item> items = itemDao.getAll();
        return view.data("items", items);
    }

}
