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
    this._persons.push(person);
  }

  update(indexPersonSelected: number, newPerson: PersonEntity) {
    if (newPerson.isValid()) {
      this._persons[indexPersonSelected] = newPerson;
    }
  }

  getByIndex(index: number): PersonEntity  {
    return Object.assign({}, this._persons[index]);
  }
  deleteByIndex(index: number): void {
    this._persons.splice(index, 1);
  }
}
