import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {WindowInfoRoutingModule} from './window-info-routing.module';
import {WindowInfoComponent} from './window-info.component';
import {GoogleMapsModule} from "@angular/google-maps";
import {FormsModule} from "@angular/forms";


@NgModule({
  declarations: [
    WindowInfoComponent
  ],
  imports: [
    CommonModule,
    WindowInfoRoutingModule,
    GoogleMapsModule,
    FormsModule
  ]
})
export class WindowInfoModule {
}
