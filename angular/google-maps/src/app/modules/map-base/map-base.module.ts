import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MapBaseComponent } from './map-base.component';
import {GoogleMapsModule} from "@angular/google-maps";
import {DynamicHostDirective} from "./dynamic-host.directive";
import { ContainerMapComponent } from './container-map.component';



@NgModule({
  declarations: [
    MapBaseComponent,
    DynamicHostDirective,
    ContainerMapComponent
  ],
  imports: [
    CommonModule,
    GoogleMapsModule,
  ],
  exports: [
    MapBaseComponent,
    //ContainerMapComponent
  ]
})
export class MapBaseModule { }
