import { HttpClientModule } from '@angular/common/http';
import { APP_INITIALIZER, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

function initializedKeycloak(keycloak: KeycloakService) {
  return () =>
  keycloak.init({
    config: {
      url: 'http://localhost:8080/',
      realm: 'master',
      clientId: 'myNewClientId'
    },
    initOptions: {
      onLoad: 'login-required', //login-required | check-sso
      flow: 'standard' //standard | implicit | hybrid
    },
  });
}

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    KeycloakAngularModule
  ],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: initializedKeycloak,
      multi: true,
      deps: [KeycloakService]
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
