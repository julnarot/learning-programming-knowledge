import { Component, Input } from '@angular/core';
import { PersonModel } from '../model/person-model';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
})
export class PersonComponent {
  user: string;
  names: string;
  surnames: string;
  dni: number;
  @Input() person?:PersonModel;
  constructor() {
    this.user = '@Julnarot';
    this.names = 'Raul Jonatan';
    this.surnames = 'Tola Choque';
    this.dni = 3433445;
  }
}
