import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

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
      declarations: [ FormProductComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormProductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('exist input name', ()=> {
    const form = fixture.debugElement.nativeElement.querySelector('#form');
    const inputElements = form.querySelectorall('input')
    expect(inputElements.length).toEqual(1)
  })

  it('chcking initial values', ()=>{
    const formGroup = component.formGroup;
    const formValues = {
      id: '',
      name: ''
    }
    expect(formGroup.value).toEqual(formValues)
  })
});
