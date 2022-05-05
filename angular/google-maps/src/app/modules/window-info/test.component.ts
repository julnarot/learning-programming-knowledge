import {Component, EventEmitter, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
    <header>
      <h1>{{markerPosition?.title}}</h1>
    </header>
    <section>
      <article>
        <h6>{{markerPosition?.subTitle}}</h6>
        <p>{{markerPosition?.description}}</p>
      </article>
    </section>
    <footer>
      <button (click)="action.emit(markerPosition.title)">event</button>
    </footer>
  `,
  styles: []
})
export class TestComponent implements OnInit {

  @Input() markerPosition: any = {};
  @Input() action: EventEmitter<any> = new EventEmitter<any>();

  constructor() {
  }

  ngOnInit(): void {
  }

}
