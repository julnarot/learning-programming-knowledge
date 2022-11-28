import { Component, Input, OnInit } from '@angular/core';
import { Product } from '../product';

@Component({
  selector: 'app-product',
  template: `
    <div>
      <h4>{{product?.name}}</h4>
      <span>{{product?.description}}</span>
    </div>
  `,
  styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit{


  @Input() product: Product = new Product();
  constructor() { }

  ngOnInit() {

  }


}
