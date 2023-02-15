import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  items = [];
  constructor() { }

  getItems() {
    return this.items;
  }

  addItem(item) {
    this.items.push(item)
  }

  editItem(index, item) {
    this.items[index] = item ;
  }
  removeByIndex(index){
    this.items.splice(index, 1)
  }
  getByIndex(index) {
    return this.items[index];
  }
  getByValue(value) {
    return this.items.find(f => f === value);
  }
}
