import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

import { Product } from './product'
describe('AppComponent', () => {
  let appComponent: AppComponent;
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'retail-product'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('retail-product');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    // expect(compiled.querySelector('.content span')?.textContent).toContain('retail-product app is running!');
    expect(compiled.querySelector('h5')?.textContent).toContain('Products managment');
  });

  it('shoud be no contact if list is empty', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.products.length).toBe(0)
  })

  it('should be contact if list not empty', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;

    const firstProduct: Product = new Product();
    firstProduct.setValue({ id: 1, name: 'orange', description: 'desc..' });
    const secondProduct: Product = new Product();
    secondProduct.setValue({ id: 2, name: 'banana', description: '...' });

    app.products.push(firstProduct);
    app.products.push(secondProduct);

    expect(app.products.length).toBe(2)

  })


});
