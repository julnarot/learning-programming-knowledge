import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { PersonComponent } from './person/person.component';
import { FormsModule } from '@angular/forms';
import { ToastService } from './services/toast.service';
import { PersonService } from './services/person.service';

@NgModule({
  declarations: [
    AppComponent,
    PersonComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [ToastService, PersonService],
  bootstrap: [AppComponent]
})
export class AppModule { }
