import { asNativeElements } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { By } from '@angular/platform-browser';
import { ListProductService } from '../list-product/list-product.service';
import { Product } from '../product';

import { FormProductComponent } from './form-product.component';

describe('FormProductComponent', () => {
  let component: FormProductComponent;
  let fixture: ComponentFixture<FormProductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [
        ReactiveFormsModule,
        FormsModule
      ],
      declarations: [FormProductComponent]
    })
      .compileComponents();

    fixture = TestBed.createComponent(FormProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  /*it('exist input name', ()=> {
    const form = fixture.debugElement.query(By.css('#form'))//.querySelector('#form');
    const inputElements = form.childNodes('input')
    expect(inputElements.length).toEqual(1)
  })*/

  it('should initial name input', () => {
    const input = fixture.debugElement.query(By.css('input'));
    const inputElement = input.nativeElement;
    const nameControl = component.formGroup.get('name');
    expect(inputElement.value).toEqual(nameControl?.value);
    expect(nameControl?.errors).not.toBeNull();
    //expect(nameControl?.errors?['required']).toBeTruthy;
  })

  it('should valid product form', (() => {
    expect(component.formGroup.valid).toBeFalse();
    const tProduct: Product = new Product();
    tProduct.setValue({ id: 1, name: 'testing name' });
    component.formGroup.patchValue(tProduct);
    expect(component.formGroup.valid).toBeTruthy();
  }))

  it('should contain the inserted product', () => {
    let service: ListProductService;
    service = TestBed.get(ListProductService);
    const tProduct: Product = new Product();
    tProduct.setValue({ name: 'testing name' });
    component.formGroup.patchValue(tProduct);
    expect(component.formGroup.valid).toBeTruthy();
    component.adding(component.formGroup.value);

    service.getProducts$().subscribe((ps: Product[]) => {
      const lastProduct = ps[ps.length - 1];
      expect(tProduct.name).toBe(lastProduct.name)
    })

  })

});
