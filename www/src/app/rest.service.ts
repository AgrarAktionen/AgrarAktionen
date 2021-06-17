import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Items } from './Items';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http : HttpClient) { }

  url : string  = "http://localhost:8080/api/item";

  getItems()
  {
    return this.http.get<Items[]>(this.url);
  }
}
