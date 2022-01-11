import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card1211',
  templateUrl: './card1211.component.html',
  styleUrls: ['./card1211.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card1211Component implements OnInit {

  value = false;

  label = `Get up`;

  value1 = false;

  label1 = `Don't give up the fight`;

  value2 = false;

  label2 = `Do something else`;

  value3 = ``;

  constructor() { }

  ngOnInit(): void {
  }

}
