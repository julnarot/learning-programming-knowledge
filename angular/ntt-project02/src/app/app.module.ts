import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PersonComponent } from './person/person.component';
import { FormsModule } from '@angular/forms';
import { ToastService } from './services/toast.service';

@NgModule({
  declarations: [
    AppComponent,
    PersonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [ToastService],
  bootstrap: [AppComponent]
})
export class AppModule { }
