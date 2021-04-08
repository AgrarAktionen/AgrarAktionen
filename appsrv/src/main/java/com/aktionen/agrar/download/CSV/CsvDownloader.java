package com.aktionen.agrar.download.CSV;

import com.opencsv.bean.CsvToBeanBuilder;
import io.quarkus.runtime.Quarkus;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.URL;
import java.util.List;

public class CsvDownloader {

    public static void main(String[] args) throws IOException {
        writeCSVUrl();
        Quarkus.run(args);
        //List<Items> listItems = cSVTOPOJO();
        //beans.forEach(System.out::println);
        //System.out.println(ListItems.get(0).getArtikelbezeichnung());
    }

    public List<Items> cSVTOPOJO() throws FileNotFoundException {

        String fileName = "src/main/java/com/aktionen/agrar/download/CSV/file.csv";
        List<Items> beans = new CsvToBeanBuilder(
                new FileReader(fileName))
                .withSeparator(';')          // custom CSV parser
                .withType(Items.class)
                .withSkipLines(1)
                .build()
                .parse();
        return beans;
    }


    private static void writeCSVUrl() throws IOException {
        InputStream inputStream = new URL("https://www.faie.at/backend/export/index/agraraktionen.csv?feedID=68&hash=1bfdc5718d84ebfd191e9ee6617a7764").openStream();
        FileOutputStream fileOS = new FileOutputStream("src/main/java/com/aktionen/agrar/download/CSV/file.csv");
        int i = IOUtils.copy(inputStream, fileOS);

    }
}