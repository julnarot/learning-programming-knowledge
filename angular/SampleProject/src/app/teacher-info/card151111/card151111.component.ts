import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card151111',
  templateUrl: './card151111.component.html',
  styleUrls: ['./card151111.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card151111Component implements OnInit {

  value = ``;

  value1 = ``;

  value2 = `undefined`;

  options = [
  	{
  		value: 'Male',
  		label: 'Male'
  	},
  	{
  		value: 'Female',
  		label: 'Female'
  	}
  ];

  value3 = ``;

  value4 = undefined;

  value5 = ``;

  value6 = ``;

  value7 = ``;

  value8 = ``;

  value9 = `undefined`;

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

  value10 = `undefined`;

  options2 = [
  	{
  		value: 'A',
  		label: 'A'
  	},
  	{
  		value: 'B',
  		label: 'B'
  	},
  	{
  		value: 'C',
  		label: 'C'
  	}
  ];

  value11 = `undefined`;

  options3 = [
  	{
  		value: 'Mathematics',
  		label: 'Mathematics'
  	},
  	{
  		value: 'Literature',
  		label: 'Literature'
  	},
  	{
  		value: 'Physics',
  		label: 'Physics'
  	}
  ];

  value12 = ``;

  constructor() { }

  ngOnInit(): void {
  }

}
