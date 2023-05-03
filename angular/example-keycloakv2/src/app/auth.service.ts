import { Injectable } from '@angular/core';
import * as Keycloak from 'keycloak-js';
import {KeycloakInstance} from 'keycloak-js';
@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private instance?: KeycloakInstance;
  constructor() { }

  init(): Promise<boolean> {
    return new Promise(async (resolve, reject) => {
      // this.bearerExcludedUrls = [
      //   '/fs/getkcconfig'
      // ];
      // const configKc = await this.fileService.getConfigKc().toPromise();
      console.log("[CONFigKc]: []");
      this.instance = Keycloak({
        realm: 'master',
        url: 'http://localhost:8080/',
        clientId: 'myNewClientId',
        // 'enable-cors': configKc['enable-cors'],
        // insertar token, reflesh
      });
      console.log("[INSTANCE]: ", this.instance);
      this.instance
        .init({ onLoad: 'login-required', checkLoginIframe: false})
        .success(async authenticated => {
          if (authenticated) {
            console.log("[SUCCCESS]: ", authenticated);

          }
          resolve(authenticated);
        })
        .error(error => {
          reject('An error happened during Keycloak initialization.');
        });
    });
  }
}
