import { HttpClientModule } from '@angular/common/http';
import { APP_INITIALIZER, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
// import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AuthService } from './auth.service';

function initializedKeycloak(keycloak: AuthService) {
  return (): Promise<any> => {
    return new Promise(async (resolve, reject) => {
      try {
        await keycloak.init();

        setTimeout(() => { // !!! sleeping time
          resolve(true);
        }, 50);
      } catch (error) {
        reject(error);
      }
    });
  };
}










@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    // KeycloakAngularModule
  ],
  providers: [
    // AuthService,
    {
      provide: APP_INITIALIZER,
      useFactory: initializedKeycloak,
      multi: true,
      deps: [AuthService]
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
