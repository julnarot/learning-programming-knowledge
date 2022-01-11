import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-card151112',
  templateUrl: './card151112.component.html',
  styleUrls: ['./card151112.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class Card151112Component implements OnInit {

  value = `undefined`;

  options = [
  	{
  		value: '1',
  		label: '1'
  	},
  	{
  		value: '2',
  		label: '2'
  	}
  ];

  value1 = `undefined`;

  options1 = [
  	{
  		value: 'Aaron Smith',
  		label: 'Aaron Smith'
  	},
  	{
  		value: 'Frederik Rose',
  		label: 'Frederik Rose'
  	}
  ];

  value2 = `undefined`;

  options2 = [
  	{
  		value: 'Jan',
  		label: 'Jan'
  	},
  	{
  		value: 'Feb',
  		label: 'Feb'
  	},
  	{
  		value: 'Mar',
  		label: 'Mar'
  	},
  	{
  		value: 'Apr',
  		label: 'Apr'
  	},
  	{
  		value: 'May',
  		label: 'May'
  	},
  	{
  		value: 'Jun',
  		label: 'Jun'
  	},
  	{
  		value: 'Jul',
  		label: 'Jul'
  	},
  	{
  		value: 'Aug',
  		label: 'Aug'
  	},
  	{
  		value: 'Sep',
  		label: 'Sep'
  	},
  	{
  		value: 'Okt',
  		label: 'Okt'
  	},
  	{
  		value: 'Nov',
  		label: 'Nov'
  	},
  	{
  		value: 'Dec',
  		label: 'Dec'
  	}
  ];

  value3 = `undefined`;

  options3 = [
  	{
  		value: '2020',
  		label: '2020'
  	},
  	{
  		value: '2019',
  		label: '2019'
  	},
  	{
  		value: '2018',
  		label: '2018'
  	}
  ];

  constructor() { }

  ngOnInit(): void {
  }

}
