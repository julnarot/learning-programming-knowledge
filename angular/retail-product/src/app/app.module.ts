import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ListProductModule } from './list-product/list-product.module';
import { FormProductModule } from './form-product/form-product.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ListProductModule,
    FormProductModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
