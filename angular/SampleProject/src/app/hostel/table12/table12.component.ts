import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-table12',
  templateUrl: './table12.component.html',
  styleUrls: ['./table12.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Table12Component implements OnInit {

  value = false;

  label = `Boys-104`;

  value1 = false;

  label1 = `Boys-104`;

  constructor() { }

  ngOnInit(): void {
  }

}
