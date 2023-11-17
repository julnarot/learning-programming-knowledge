import { Component, OnInit } from '@angular/core';
import { PersonModel } from './model/person-model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  title = 'Project 02';
  enabled = true;
  names = '';

  personList: PersonModel[] = [];

  ngOnInit(): void {}
  onAddPerson() {
    const newPerson = new PersonModel('S/N', this.names, 'S/N', undefined, []);
    this.appendToList(newPerson);
    newPerson.resetValues();
    this.resetForm();
  }
  appendToList(person: PersonModel) {
    this.personList.push(person);
  }
  resetForm(): void {
    this.names = '';
  }
}
