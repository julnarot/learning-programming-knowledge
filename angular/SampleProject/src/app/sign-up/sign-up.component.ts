import { Component, OnInit, ChangeDetectionStrategy } from '@angular/core';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class SignUpComponent implements OnInit {

  value = ``;

  value1 = ``;

  value2 = ``;

  value3 = false;

  label = `I agree to the Terms of Service and Privacy Policy`;

  url = `${ '/Log-in' }`;

  constructor() { }

  ngOnInit(): void {
  }

}
