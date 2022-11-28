import { Injectable } from '@angular/core';
import { Product } from '../product';
import { BehaviorSubject, Observable, Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ListProductService {

  private productsBS$: BehaviorSubject<Product[]> = new BehaviorSubject<Product[]>([]);
  private productSub$: Subject<Product> = new Subject<Product>();
  constructor() { }

  getProducts$(): Observable<Product[]> {
    return this.productsBS$.asObservable();
  }

  setProducts(products: Product[]): void {
    this.productsBS$.next(products);
  }

  addProduct(product: Product): void {
    this.setProducts([...this.productsBS$.getValue(), ...[product]])
  }

  addFormProduct(product: any): void {
    product.id = new Date().getTime();
    const nProduct: Product = new Product();
    nProduct.assign(product);
    this.addProduct(nProduct)
  }

  editFormProduct(product: any): void {
    const nProduct: Product = new Product();
    nProduct.assign(product);
    this.setProducts([...this.productsBS$.getValue()].map((fr: Product) => {
      return fr.id == nProduct.id ? nProduct : fr;
    }));
    this.setProduct(new Product())
  }

  setProduct(product: Product): void {
    this.productSub$.next(product);
  }

  getProduct$(): Observable<Product> {
    return this.productSub$.asObservable();
  }


}
