import { Component, OnInit } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Product } from '../product';
import { ListProductService } from './list-product.service';

@Component({
  selector: 'app-list-product',
  template: `
      <app-product *ngFor="let product of products$|async" [product]="product" (click)="productSelected(product)">
      </app-product>
  `,
  styleUrls: ['./list-product.component.scss']
})
export class ListProductComponent implements OnInit {
  products$: Observable<Product[]> = of([]);
  constructor(
    private listProductService: ListProductService,
  ) { }

  ngOnInit(): void {
    this.products$ = this.listProductService.getProducts$();
  }
  productSelected(product: Product) {
    this.listProductService.setProduct(product);
  }

}
