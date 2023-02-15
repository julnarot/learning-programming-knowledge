import { Component } from '@angular/core';
import { ItemService } from './item.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'demoprotractor';
  itemName  = "";
  indexName  = -1;
  items: any[] = [];
  isEditing = false;

  constructor(private itemService: ItemService) {
  }
  onSave() {
    if(this.isEditing) {
      this.itemService.editItem(this.indexName, this.itemName)
    }else {
      this.itemService.addItem(this.itemName)
    }
    this.restoreAndGetItems()
  }
  onSelectEdit(index) {
    this.indexName = index;
    this.itemName = this.items[index];
    this.isEditing = true;
  }
  restoreAndGetItems() {
    this.itemName = "";
    this.indexName = -1;
    this.isEditing = false;
    this.onGetItems();
  }
  onGetItems() {
    this.items = this.itemService.getItems();
  }
  onDelete(index) {
    this.itemService.removeByIndex(index);
    this.restoreAndGetItems();
  }

}
