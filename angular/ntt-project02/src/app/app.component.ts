import { Component, OnInit } from '@angular/core';
import { PersonModel } from './model/person-model';
import { ToastService } from './services/toast.service';
import { PersonService } from './services/person.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'Project 02';
  enabled = true;
  names = '';

  constructor(
    private toastService: ToastService,
    private personService: PersonService
  ) {}
  personList: PersonModel[] = [];

  ngOnInit(): void {}
  onAddPerson() {

    this.personService.addNamePerson(this.names);
    this.personList = this.personService.getAll();
    this.toastService.showSuccess('Person added', 'Success');
    this.resetForm();
  }

  resetForm(): void {
    this.names = '';
  }
}
