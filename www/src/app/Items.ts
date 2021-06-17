export class Price {
    bruttopreis: string;
    stattpreis: string;

    constructor(bruttopreis, stattpreis) {
        this.bruttopreis = bruttopreis;
        this.stattpreis = stattpreis;
    }
}
export class Items
{
    artikelbezeichnung : string;
    artikelnummer : string;
    beschreibungsfeld : string;
    bildLink : string;
    deeplink : string;
    ean : string;
    hersteller : string;
    kategoriepfad : string;
    verfuegbarkeit : string;
    versandkosten : string;
    prices : Price;


    constructor(artikelbezeichnung, artikelnummer, beschreibungsfeld, bildLink, deepLink, 
        ean, hersteller, kategoriepfad, verfuegbarkeit,  versandkosten, prices)
    {
        this.artikelbezeichnung = artikelbezeichnung;
        this.artikelnummer = artikelnummer;
        this.beschreibungsfeld = beschreibungsfeld;
        this.bildLink = bildLink;
        this.deeplink = deepLink;
        this.ean = ean;
        this.hersteller = hersteller;
        this.kategoriepfad = kategoriepfad;
        this.verfuegbarkeit = verfuegbarkeit;
        this.versandkosten = versandkosten;
        this.prices = prices.bruttopreis;
        
    }
}