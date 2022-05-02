import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MarkerClustererComponent } from './marker-clusterer.component';
import {GoogleMapsModule} from "@angular/google-maps";
import { MarkerClustererRoutingModule } from './marker-clusterer-routing.module';



@NgModule({
  declarations: [
    MarkerClustererComponent
  ],
  imports: [
    CommonModule,
    GoogleMapsModule,
    MarkerClustererRoutingModule
  ]
})
export class MarkerClustererModule { }
