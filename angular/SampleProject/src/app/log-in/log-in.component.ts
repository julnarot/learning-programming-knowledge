import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class LogInComponent implements OnInit {

  value = ``;

  value1 = ``;

  url = `${ '/Log-in' }`;

  constructor() { }

  ngOnInit(): void {
  }

}
