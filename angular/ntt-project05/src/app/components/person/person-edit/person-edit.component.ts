import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PersonEntity } from 'src/app/entities/person-entity';
import { PersonService } from 'src/app/services/person.service';

@Component({
  selector: 'app-person-edit',
  templateUrl: './person-edit.component.html',
  styleUrls: ['./person-edit.component.css'],
})
export class PersonEditComponent implements OnInit {
  person: PersonEntity = new PersonEntity();
  indexPersonSelected = -1;
  constructor(
    private readonly personService: PersonService,
    private readonly router: Router,
    private readonly activatedRoute: ActivatedRoute
  ) {
    this.indexPersonSelected = Number(
      this.activatedRoute.snapshot.params['idx']
    );
    if (this.indexPersonSelected < 0) {
      this.goBack();
    }
  }

  ngOnInit(): void {
    this.person = this.personService.getByIndex(this.indexPersonSelected - 1);
  }
  onUpdate() {
    if (this.person && this.indexPersonSelected > 0) {
      this.personService.update(this.indexPersonSelected - 1, this.person);
      this.goBack();
    }
  }
  goBack() {
    this.router.navigate(['/home']);
  }
}
