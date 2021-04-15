package com.aktionen.agrar.download;

import com.aktionen.agrar.dao.ItemDao;
import com.aktionen.agrar.model.Item;
import com.opencsv.bean.CsvToBeanBuilder;
import io.quarkus.runtime.Quarkus;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.util.List;

public class CsvDownloader {

    ItemDao itemDao = new ItemDao();

    public static void main(String[] args) throws IOException {
        //writeCSVUrl();

        Quarkus.run(args);
        CsvDownloader csvDownloader = new CsvDownloader();
        //csvDownloader.cSVTOPOJO();
    }

    public List<Item> cSVTOPOJO() throws FileNotFoundException {

        String fileName = "src/main/java/com/aktionen/agrar/download/CSV/file.csv";
        List<Item> beans = new CsvToBeanBuilder(
                new FileReader(fileName))
                .withSeparator(';')          // custom CSV parser
                .withType(Item.class)
                .withSkipLines(1)
                .build()
                .parse();

        //beans.forEach(System.out::println);
        //itemDao.saveAll(beans);

        return beans;
    }


    private static void writeCSVUrl() throws IOException {
        InputStream inputStream = new URL("https://www.faie.at/backend/export/index/agraraktionen.csv?feedID=68&hash=1bfdc5718d84ebfd191e9ee6617a7764").openStream();
        FileOutputStream fileOS = new FileOutputStream("src/main/java/com/aktionen/agrar/download/CSV/file.csv");
        int i = IOUtils.copy(inputStream, fileOS);

    }
}