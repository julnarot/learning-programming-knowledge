import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListProductComponent } from './list-product.component';
import { ProductModule } from '../product/product.module';



@NgModule({
  declarations: [
    ListProductComponent
  ],
  imports: [
    CommonModule,
    ProductModule
  ],
  exports: [
    ListProductComponent
  ]
})
export class ListProductModule { }
