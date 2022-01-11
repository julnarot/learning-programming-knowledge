import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card15111',
  templateUrl: './card15111.component.html',
  styleUrls: ['./card15111.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card15111Component implements OnInit {

  value = ``;

  value1 = ``;

  value2 = `undefined`;

  options = [
  	{
  		value: '1',
  		label: '1'
  	},
  	{
  		value: '2',
  		label: '2'
  	},
  	{
  		value: '3',
  		label: '3'
  	}
  ];

  value3 = `undefined`;

  options1 = [
  	{
  		value: '1',
  		label: '1'
  	},
  	{
  		value: '2',
  		label: '2'
  	},
  	{
  		value: '3',
  		label: '3'
  	}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
