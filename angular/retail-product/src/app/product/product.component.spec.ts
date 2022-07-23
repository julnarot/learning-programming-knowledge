import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Product } from '../product';

import { ProductComponent } from './product.component';

describe('ProductComponent', () => {
  let component: ProductComponent;
  let fixture: ComponentFixture<ProductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('should be property name', ()=> {
    const nproduct: Product = new Product();
    nproduct.id = 1;
    nproduct.name = 'yeah!';
    component.product = nproduct;
    expect(component.product).toBe(nproduct);
  })
});
