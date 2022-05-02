import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CircleComponent} from './circle.component';
import {GoogleMapsModule} from "@angular/google-maps";
import {FormsModule} from "@angular/forms";
import {CircleRoutingModule} from "./circle.routing.module";


@NgModule({
  declarations: [
    CircleComponent
  ],
  imports: [
    CommonModule,
    CircleRoutingModule,
    GoogleMapsModule,
    FormsModule
  ]
})
export class CircleModule {
}
