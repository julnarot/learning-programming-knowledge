import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioSegurosComponent } from './formulario-seguros.component';

describe('FormularioSegurosComponent', () => {
  let component: FormularioSegurosComponent;
  let fixture: ComponentFixture<FormularioSegurosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FormularioSegurosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FormularioSegurosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
