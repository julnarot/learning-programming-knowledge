import { Component, ElementRef, OnDestroy, OnInit, ViewChild } from '@angular/core';
import { AbstractControl, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { ListProductService } from '../list-product/list-product.service';
import { Product } from '../product';

@Component({
  selector: 'app-form-product',
  template: `
  <form [formGroup]="formGroup" id="form" (ngSubmit)="onSubmit()">
    <div>
      <label>Name</label><br>
      <input type="text" formControlName="name" #name>
    </div>
    <div>
      <label>Description</label><br>
      <textarea formControlName="description"></textarea>
    </div>
    <div>
      <button type="submit" [disabled]="formGroup.invalid">Save</button>
    </div>
  </form>

  `,
  styleUrls: ['./form-product.component.scss']
})
export class FormProductComponent implements OnInit, OnDestroy {
  formGroup: FormGroup;
  productSubcription?: Subscription;

  @ViewChild('name') fieldName?: ElementRef;
  constructor(
    private formBuilder: FormBuilder,
    private listProductService: ListProductService
  ) {
    this.formGroup = this.formBuilder.group({
      id: [],
      name: ['', Validators.required],
      description: [],
    });
  }

  ngOnInit(): void {
    this.productSubcription = this.listProductService.getProduct$()
      .subscribe((product: Product) => {
        if (product) this.formGroup.setValue(product);
      });
  }


  onSubmit() {
    const fValue = this.formGroup.value;

    if (fValue.id) {
      this.updating(fValue);
    } else {
      this.adding(fValue);
    }
    this.formReset();
  }

  adding(value: any) {
    this.listProductService.addFormProduct(value);
  }

  updating(value: any) {
    this.listProductService.editFormProduct(value);
  }

  formReset() {
    this.formGroup.reset();
    this.formGroup.get('name')?.setValidators(Validators.required);
    this.fieldName?.nativeElement.focus();
  }

  ngOnDestroy(): void {
    if (this.productSubcription) this.productSubcription.unsubscribe()
  }


}
