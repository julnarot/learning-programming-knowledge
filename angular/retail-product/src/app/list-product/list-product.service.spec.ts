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

});
