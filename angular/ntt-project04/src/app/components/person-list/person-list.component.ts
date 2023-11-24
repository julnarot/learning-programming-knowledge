import { Component, Input, Output } from '@angular/core';
import { PersonModel } from 'src/app/models/person-model';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.css'],
})
export class PersonListComponent {
  @Output() editingIndex= -1;
  @Output() deletingIndex= -1;
  @Input() personList: Array<PersonModel> = [];

  deletePerson(index: number): void {
    this.personList.splice(index, 1);
  }
  editPerson(index: number): void {
    const person = this.personList[index];
  }
}
