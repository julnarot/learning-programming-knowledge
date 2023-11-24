import { Component } from '@angular/core';
import { PersonEntity } from 'src/app/entities/person-entity';
import { PersonService } from 'src/app/services/person.service';

@Component({
  selector: 'app-person-list',
  templateUrl: './person-list.component.html',
  styleUrls: ['./person-list.component.css'],
})
export class PersonListComponent {
  persons: PersonEntity[] = [];

  constructor(private personService: PersonService) {
    this.persons = this.personService.getAll();
  }
}
