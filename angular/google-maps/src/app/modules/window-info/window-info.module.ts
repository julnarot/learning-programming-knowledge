import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {WindowInfoRoutingModule} from './window-info-routing.module';
import {WindowInfoComponent} from './window-info.component';
import {GoogleMapsModule} from "@angular/google-maps";
import {FormsModule} from "@angular/forms";
import { DynamicHostDirective } from '../map-base/dynamic-host.directive';
import { TestComponent } from './test.component';
import {MapBaseModule} from "../map-base/map-base.module";


@NgModule({
  declarations: [
    WindowInfoComponent,
    //DynamicHostDirective,
    TestComponent
  ],
  imports: [
    CommonModule,
    WindowInfoRoutingModule,

    FormsModule,
    MapBaseModule
  ]
})
export class WindowInfoModule {
}
