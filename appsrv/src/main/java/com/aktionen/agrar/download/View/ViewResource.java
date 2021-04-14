package com.aktionen.agrar.download.View;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


import com.aktionen.agrar.dao.ItemDao;
import com.aktionen.agrar.download.CSV.CsvDownloader;
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
        List<Item> items = csvDownloader.cSVTOPOJO();
        itemDao.insertAll(items);
    }


    @GET
    public TemplateInstance templateInstance() {
        List<Item> items = itemDao.all();
        return view.data("items", items);
    }

}
