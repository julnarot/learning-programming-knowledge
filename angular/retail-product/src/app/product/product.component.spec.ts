import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { Product } from '../product';

import { ProductComponent } from './product.component';

describe('ProductComponent', () => {
  let component: ProductComponent;
  let fixture: ComponentFixture<ProductComponent>;
  let h4: HTMLElement;


  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ProductComponent]
    })
      .compileComponents();

    fixture = TestBed.createComponent(ProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    h4 = fixture.nativeElement.querySelector('h4');
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
  it('should be property name', () => {
    const nproduct: Product = new Product();
    nproduct.id = 1;
    nproduct.name = 'yeah!';
    component.product = nproduct;
    expect(component.product).toBe(nproduct);
  })

  it('should show product title', async(() => {
    const mainProduct: Product = new Product();
    mainProduct.id = 1;
    mainProduct.name = 'yeah!';
    fixture.detectChanges();
    component.product = mainProduct;
    component.ngOnInit();
    fixture.whenStable().then(() => {
    fixture.detectChanges();
    expect(h4.textContent).toContain(component.product.name)
  });
 }));

});
