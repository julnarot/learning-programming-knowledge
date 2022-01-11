import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-table122',
  templateUrl: './table122.component.html',
  styleUrls: ['./table122.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Table122Component implements OnInit {

  value = false;

  label = `20210`;

  value1 = false;

  label1 = `22015`;

  value2 = false;

  label2 = `22020`;

  value3 = false;

  label3 = `22030`;

  value4 = false;

  label4 = `22040`;

  constructor() { }

  ngOnInit(): void {
  }

}
