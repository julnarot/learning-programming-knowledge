import { Component } from '@angular/core';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css'],
})
export class PersonComponent {
  names: string;
  lastNames: string;
  dni: number;
  constructor() {
    this.names = 'Raul Jonatan';
    this.lastNames = 'Tola Choque';
    this.dni = 3433445;
  }
}
