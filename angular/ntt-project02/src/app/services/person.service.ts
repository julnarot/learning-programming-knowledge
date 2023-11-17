import { Injectable } from '@angular/core';
import { PersonModel } from '../model/person-model';

@Injectable()
export class PersonService {
  private _persons: PersonModel[] = [];

  constructor() {}

  addPerson(person: PersonModel): void {
    this._persons.push(person);
  }
  addNamePerson(names: string): void {
    const newPerson = new PersonModel('S/N', names, 'S/N', undefined, []);
    this.addPerson(newPerson);
  }
  getAll(): PersonModel[] {
    return this._persons;
  }
}
