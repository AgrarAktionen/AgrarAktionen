import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Item} from '../interface/item/item';

const URL = "http://localhost:8080/api/item"

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  constructor(private client : HttpClient) { }

  getAll() {
    return this.client.get<Item[]>(URL); 
  }
  getID(id: Number) {
    var URLID = "http://localhost:8080/api/item/" + id.toString();
    return this.client.get<Item>(URLID);
  }
}
