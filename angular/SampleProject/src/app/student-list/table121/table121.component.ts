import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-table121',
  templateUrl: './table121.component.html',
  styleUrls: ['./table121.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Table121Component implements OnInit {

  value = false;

  label = `#2675`;

  value1 = false;

  label1 = `#2676`;

  value2 = false;

  label2 = `#2677`;

  value3 = false;

  label3 = `#2678`;

  value4 = false;

  label4 = `#2679`;

  constructor() { }

  ngOnInit(): void {
  }

}
