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

  onList(): void {
    console.log('hello Word');
  }
  nameChanged(nameInpuElement: Event) {
    this.names = (<HTMLInputElement>nameInpuElement?.target).value;
  }

  ngOnInit(): void {}
  onAddPerson() {
    this.personList.push(
      new PersonModel('Julnarot', this.names, 'Tola Choque', 3433445, [])
    );
    this.resetForm();
  }
  resetForm(): void {
    this.names = '';
  }
}
