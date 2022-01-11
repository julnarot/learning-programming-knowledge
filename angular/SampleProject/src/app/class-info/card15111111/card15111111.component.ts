import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card15111111',
  templateUrl: './card15111111.component.html',
  styleUrls: ['./card15111111.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card15111111Component implements OnInit {

  value = `undefined`;

  options = [
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

  value1 = `undefined`;

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

  value2 = `undefined`;

  options2 = [
  	{
  		value: 'Aaron Jason',
  		label: 'Aaron Jason'
  	},
  	{
  		value: 'Amily Watson',
  		label: 'Amily Watson'
  	}
  ];

  value3 = `undefined`;

  options3 = [
  	{
  		value: 'Monday',
  		label: 'Monday'
  	},
  	{
  		value: 'Tuesday',
  		label: 'Tuesday'
  	},
  	{
  		value: 'Wednesday',
  		label: 'Wednesday'
  	},
  	{
  		value: 'Thursday',
  		label: 'Thursday'
  	},
  	{
  		value: 'Friday',
  		label: 'Friday'
  	}
  ];

  value4 = ``;

  constructor() { }

  ngOnInit(): void {
  }

}
