import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Subscription } from 'rxjs';
import { ListProductService } from '../list-product/list-product.service';
import { Product } from '../product';

@Component({
  selector: 'app-form-product',
  template: `
  <form [formGroup]="formGroup" (ngSubmit)="onSave()">
    <div>
      <label>Name</label><br>
      <input type="text" formControlName="name">
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

  onSave() {
    const fValue = this.formGroup.value;

    if(fValue.id) {
      this.listProductService.editFormProduct(this.formGroup.value);
    } else {
      this.listProductService.addFormProduct(this.formGroup.value);
    }

    this.formReset();
  }

  formReset() {
    this.formGroup.reset();
    this.formGroup.get('name')?.setValidators(Validators.required);
  }

  ngOnDestroy(): void {
      if(this.productSubcription) this.productSubcription.unsubscribe()
  }


}
