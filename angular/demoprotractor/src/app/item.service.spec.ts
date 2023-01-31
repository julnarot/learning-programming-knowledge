import { TestBed } from '@angular/core/testing';

import { ItemService } from './item.service';

describe('ItemService', () => {
  let service: ItemService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ItemService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});


describe('ItemService', ()=> {
  let service: ItemService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ItemService);
  });

  it('should be empty', () => {
    const emptyItems = service.getItems();
    expect(emptyItems.length).toEqual(0);
  });
  it('should be has two element', () => {
    service.addItem("1");
    service.addItem("2");
    const items = service.getItems();
    expect(items.length).toEqual(2);
  });
})

describe('should validate CRUDS', ()=> {
  let service: ItemService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ItemService);
  });

  it('should be empty', () => {
    const emptyItems = service.getItems();
    expect(emptyItems.length).toEqual(0);
  });
  it('should be have', () => {
    service.addItem("firstElement");
    service.addItem("secondElement");
    const items = service.getItems();
    expect(items.length).toEqual(2);
  });

  it('should be one', () => {
    service.addItem("firstElement");
    service.addItem("secondElement");
    service.removeByIndex(0);
    const items = service.getItems();
    expect(items.length).toEqual(1);
  });

  it('lastElement should be firstElement',()=> {
    const item = "firstElement";
    service.addItem(item);
    expect(service.getByValue(item)).toEqual(item);
  });

  it('shoould be find', ()=> {
    const itemName = "firstElement";
    service.addItem(itemName);
    const itemFound = service.getByValue(itemName);
    expect(itemFound).toEqual(itemName);
  });

})
