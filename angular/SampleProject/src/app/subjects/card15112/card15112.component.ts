import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card15112',
  templateUrl: './card15112.component.html',
  styleUrls: ['./card15112.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card15112Component implements OnInit {

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
  		value: 'Aaron Jason',
  		label: 'Aaron Jason'
  	},
  	{
  		value: 'Amily Watson',
  		label: 'Amily Watson'
  	}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
