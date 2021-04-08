package com.aktionen.agrar.download.CSV;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;


public class Items {
   // Artikelbezeichnung;Hersteller;Artikelnummer;Kategoriepfad;Beschreibungsfeld;Bild-Link;Deeplink;Verfuegbarkeit;Bruttopreis;Stattpreis;EAN;Versandkosten;

    @CsvBindByPosition(position = 0)
    private String artikelbezeichnung;

    @CsvBindByPosition(position = 1)
    private String hersteller;

    @CsvBindByPosition(position = 2)
    private String artikelnummer;

    @CsvBindByPosition(position = 3)
    private String kategoriepfad;

    @CsvBindByPosition(position = 4)
    private String beschreibungsfeld;

    @CsvBindByPosition(position = 5)
    private String bildLink;

    @CsvBindByPosition(position = 6)
    private String deeplink;

    @CsvBindByPosition(position = 7)
    private String verfuegbarkeit;

    @CsvBindByPosition(position = 8)
    private String bruttopreis;

    @CsvBindByPosition(position = 9)
    private String stattpreis;

    @CsvBindByPosition(position = 10)
    private String ean;

    @CsvBindByPosition(position = 11)
    private String versandkosten;

    public String getArtikelbezeichnung() {
        return artikelbezeichnung;
    }

    public void setArtikelbezeichnung(String artikelbezeichnung) {
        this.artikelbezeichnung = artikelbezeichnung;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getKategoriepfad() {
        return kategoriepfad;
    }

    public void setKategoriepfad(String kategoriepfad) {
        this.kategoriepfad = kategoriepfad;
    }

    public String getBeschreibungsfeld() {
        return beschreibungsfeld;
    }

    public void setBeschreibungsfeld(String beschreibungsfeld) {
        this.beschreibungsfeld = beschreibungsfeld;
    }

    public String getBildLink() {
        return bildLink;
    }

    public void setBildLink(String bildLink) {
        this.bildLink = bildLink;
    }

    public String getDeeplink() {
        return deeplink;
    }

    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    public String getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public void setVerfuegbarkeit(String verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }

    public String getBruttopreis() {
        return bruttopreis;
    }

    public void setBruttopreis(String bruttopreis) {
        this.bruttopreis = bruttopreis;
    }

    public String getStattpreis() {
        return stattpreis;
    }

    public void setStattpreis(String stattpreis) {
        this.stattpreis = stattpreis;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getVersandkosten() {
        return versandkosten;
    }

    public void setVersandkosten(String versandkosten) {
        this.versandkosten = versandkosten;
    }

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
                ", ean='" + ean + '\'' +
                ", versandkosten='" + versandkosten + '\'' +
                '}';
    }
}
