package com.aktionen.agrar.download.View;

import javax.inject.Inject;
import javax.ws.rs.*;

import com.aktionen.agrar.download.CSV.CsvDownloader;
import com.aktionen.agrar.download.CSV.Items;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import java.io.FileNotFoundException;
import java.util.List;

@Path("view")
public class ViewResource {

    CsvDownloader csvDownloader = new CsvDownloader();

    @Inject
    Template view;


    @GET
    public TemplateInstance templateInstance() throws FileNotFoundException {
        List<Items> items = csvDownloader.cSVTOPOJO();
        return view.data("items", items);
    }

}
