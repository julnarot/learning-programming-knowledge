import { inject, TestBed, waitForAsync } from '@angular/core/testing';
import { Product } from '../product';

import { ListProductService } from './list-product.service';

describe('ListProductService', () => {
  let service: ListProductService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListProductService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });


  it('should be zero for initial get product service', waitForAsync(inject([ListProductService], (listProductService: ListProductService) => {
    listProductService
      .getProducts$()
      .subscribe((result: Product[]) => expect(result.length)
        .toBe(0));
  })));

  it('should be select product', () => {
    let service: ListProductService;
    service = TestBed.get(ListProductService);
    let products: Product[];
    const product: Product = new Product()
    product.setValue({ id: 1, name: 'test' });
    service.setProduct(product);
    service.getProduct$().subscribe((ps: Product)=> {
      expect(ps).toBe(product)
    })
  })

});
