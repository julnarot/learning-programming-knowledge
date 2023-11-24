import { Injectable } from '@angular/core';
import { PersonEntity } from '../entities/person-entity';

@Injectable({
  providedIn: 'root',
})
export class PersonService {
  private _persons: PersonEntity[] = [];

  constructor() {}
  getAll(): PersonEntity[] {
    return [...this._persons];
  }
  add(person: PersonEntity): void {
    person.id = this._persons.length + 1;
    this._persons.push(person);
  }
}
