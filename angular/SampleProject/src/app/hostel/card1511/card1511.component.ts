import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card1511',
  templateUrl: './card1511.component.html',
  styleUrls: ['./card1511.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card1511Component implements OnInit {

  value = ``;

  value1 = ``;

  value2 = `undefined`;

  options = [
  	{
  		value: 'Big',
  		label: 'Big'
  	},
  	{
  		value: 'Medium',
  		label: 'Medium'
  	},
  	{
  		value: 'Large',
  		label: 'Large'
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

  value4 = ``;

  constructor() { }

  ngOnInit(): void {
  }

}
