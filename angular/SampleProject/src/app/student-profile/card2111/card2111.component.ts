import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card2111',
  templateUrl: './card2111.component.html',
  styleUrls: ['./card2111.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card2111Component implements OnInit {

  value = false;

  label = `Get up`;

  value1 = false;

  label1 = `Don't give up the fight`;

  value2 = false;

  label2 = `Do something else`;

  value3 = false;

  label3 = `Do homework`;

  value4 = ``;

  constructor() { }

  ngOnInit(): void {
  }

}
