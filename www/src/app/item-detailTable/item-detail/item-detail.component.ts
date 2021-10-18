import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Item } from 'src/app/interface/item/item';
import { ItemService } from 'src/app/item-service/item.service';

@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.scss']
})
export class ItemDetailComponent implements OnInit {

  public itemID!: Number;
  public item!: Item;

  constructor(private itemService: ItemService, private route: ActivatedRoute) { 
    this.itemID = Number(this.route.snapshot.paramMap.get('id'));
    this.itemService.getID(this.itemID).subscribe(item => this.item = item);
  }

  ngOnInit(): void {
    
  }
}
