import { Component, OnInit } from '@angular/core';
import { Item } from '../interface/item/item';
import { ItemService } from '../item-service/item.service';
import { Router } from '@angular/router';

@Component({
  selector: 'item-table',
  templateUrl: './item-table.component.html',
  styleUrls: ['./item-table.component.scss']
})
export class ItemTableComponent implements OnInit {

  items: Item [] = []

  constructor(private itemService: ItemService, private router: Router) { 
    this.itemService.getAll().subscribe(items => this.items = items)
  }

  ngOnInit(): void {
  
  }

  clicked(item: Item) {
    //alert(`${item.itemId} ausgewählt`)
    this.router.navigate(['/item', item.itemId]);
  }
}
