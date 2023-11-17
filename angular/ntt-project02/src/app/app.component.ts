import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'ntt-project02';
  enabled = true;
  names = '';

  onList(): void {
    console.log('hello Word');
  }
  nameChanged(nameInpuElement: Event) {
    this.names = (<HTMLInputElement>nameInpuElement?.target).value;
  }
}
