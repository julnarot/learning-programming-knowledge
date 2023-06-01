import { APP_INITIALIZER, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

function initializeKeycloak(keycloak: KeycloakService) {
  return () =>
    keycloak.init({
      config: {
        url: 'http://localhost:8080',
        realm: 'master',
        clientId: 'angularv2',
      },
      initOptions: {
        onLoad: 'check-sso',
        // checkLoginIframe: false,
        silentCheckSsoRedirectUri:
          window.location.origin + '/assets/silent-check-sso.html',
      },
    });
}

@NgModule({
  declarations: [AppComponent],
  imports: [AppRoutingModule, BrowserModule, KeycloakAngularModule],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: initializeKeycloak,
      multi: true,
      deps: [KeycloakService],
    },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}

// set Valid redirect URIs value with simple [ * ]
// http://localhost:8080/admin/master/console/#/master/realm-settings/security-defenses
// DEFAULT [Content-Security-Policy] = frame-src 'self'; frame-ancestors 'self'; object-src 'none';
// -> replace for like: frame-src 'self'; frame-ancestors 'self' http://localhost:4200/ http://localhost:4200 http://127.0.0.1 http://192.168.1.140 http://localhost *.home-life.hub http://trex-macbook.home-life.hub localhost; object-src 'none';
