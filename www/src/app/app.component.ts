import { Component, OnInit } from '@angular/core';
import { RestService } from './rest.service';
import { Items } from './Items';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  title = 'Agrar-Aktionen';

  constructor(private rs : RestService){}

  columns = ["Artikelbezeichnung", "Artikelnummer", "Beschreibungsfeld", "Bild-Link", 
            "DeepLink", "EAN", "Hersteller", "Kategoriepfad", "Bruttopreis", "Stattpreis", "Verfügbarkeit", "Versandkosten"];

  index = ["artikelbezeichnung", "artikelnummer", "beschreibungsfeld", "bildLink", "deeplink", "ean",
            "hersteller", "kategoriepfad", "prices.bruttopreis", "prices", "verfuegbarkeit", "versandkosten"];

  items : Items[] = [];

  ngOnInit(): void {
    this.rs.getItems().subscribe
    ( 
      (response)=>
      {
        this.items = response;
      },

      (error)=>
      {
        console.log("Error Occured : "+error);
      }
    )
  }
}
