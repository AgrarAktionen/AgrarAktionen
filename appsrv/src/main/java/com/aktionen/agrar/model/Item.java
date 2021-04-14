package com.aktionen.agrar.model;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Item {
   // Artikelbezeichnung;Hersteller;Artikelnummer;Kategoriepfad;Beschreibungsfeld;Bild-Link;Deeplink;Verfuegbarkeit;Bruttopreis;Stattpreis;EAN;Versandkosten;

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 1000)
    @CsvBindByPosition(position = 0)
    private String artikelbezeichnung;

    @Column(length = 1000)
    @CsvBindByPosition(position = 1)
    private String hersteller;

    @Column(length = 1000)
    @CsvBindByPosition(position = 2)
    private String artikelnummer;

    @Column(length = 1000)
    @CsvBindByPosition(position = 3)
    private String kategoriepfad;

    @Column(length = 1000)
    @CsvBindByPosition(position = 4)
    private String beschreibungsfeld;

    @Column(length = 1000)
    @CsvBindByPosition(position = 5)
    private String bildLink;

    @Column(length = 1000)
    @CsvBindByPosition(position = 6)
    private String deeplink;

    @Column(length = 1000)
    @CsvBindByPosition(position = 7)
    private String verfuegbarkeit;

    @Column(length = 1000)
    @CsvBindByPosition(position = 8)
    private String bruttopreis;

    @Column(length = 1000)
    @CsvBindByPosition(position = 9)
    private String stattpreis;

/*    @Column(length = 1000)
    @CsvBindByPosition(position = 10)
    private String ean;
*/
    @Column(length = 1000)
    @CsvBindByPosition(position = 10)
    private String versandkosten;

    @Override
    public String toString() {
        return "Items{" +
                "artikelbezeichnung='" + artikelbezeichnung + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", artikelnummer='" + artikelnummer + '\'' +
                ", kategoriepfad='" + kategoriepfad + '\'' +
                ", beschreibungsfeld='" + beschreibungsfeld + '\'' +
                ", bildLink='" + bildLink + '\'' +
                ", deeplink='" + deeplink + '\'' +
                ", verfuegbarkeit='" + verfuegbarkeit + '\'' +
                ", bruttopreis='" + bruttopreis + '\'' +
                ", stattpreis='" + stattpreis + '\'' +
                ", versandkosten='" + versandkosten + '\'' +
                '}';
    }

}
