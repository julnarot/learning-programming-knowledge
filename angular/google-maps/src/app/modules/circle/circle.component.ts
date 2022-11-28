import { Component, OnInit } from '@angular/core';
import {LatLngLiteral} from "../../interfaces/interfaces";
import {environment} from "../../../environments/environment";

@Component({
  selector: 'app-circle',
  template: `
    <label for="radius">Circle range</label>
    <input type="range" id="radius" [(ngModel)]="radius"/>
    <google-map
      width="100%"
      [center]="defLatLng"
      [zoom]="12">
      <map-circle [center]="defLatLng" [radius]="radius*100"></map-circle>
    </google-map>
  `,
  styles: [
  ]
})
export class CircleComponent implements OnInit {
  defLatLng: LatLngLiteral = environment.initialDefaultPosition;
  radius = 100;
  constructor() { }

  ngOnInit(): void {
	  console.log("hola testing");
  }

}
