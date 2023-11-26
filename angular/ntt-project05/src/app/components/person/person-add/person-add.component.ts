import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { PersonEntity } from 'src/app/entities/person-entity';
import { PersonService } from 'src/app/services/person.service';

@Component({
  selector: 'app-person-add',
  templateUrl: './person-add.component.html',
  styleUrls: ['./person-add.component.css'],
})
export class PersonAddComponent {
  person: PersonEntity = new PersonEntity();
  constructor(
    private personService: PersonService,
    private readonly router: Router
  ) {}
  onSave() {
    if (this.person) {
      this.personService.add(this.person);
      this.router.navigate(['/home']);
    }
  }
}
