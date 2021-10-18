import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ItemDetailComponent } from './item-detailTable/item-detail/item-detail.component';
import { ItemTableComponent } from './item-table/item-table.component';

const routes: Routes = [ 
  {path: 'item/:id', component: ItemDetailComponent},
  {path: '', component: ItemTableComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents = [ItemDetailComponent,
ItemTableComponent]
