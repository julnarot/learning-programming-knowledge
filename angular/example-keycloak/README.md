# ExampleKeycloak

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 13.2.2.

## Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Creating openIdClient

* Go on console page of Keycloak `http://localhost:8080/admin/master/console/#/` and select Clients menu

![menu clients](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_001.PNG?raw=true)

* Click in Create client button, complete fields and then  click in Next button:

![New Client](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_002.PNG?raw=true)

* In the secction Access settings complete valid redirect and web origins
![Access settings](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_003.PNG?raw=true)

* In Capability config section for authentication flow mark only Standard flow and Implicit flow y press Save button

![Capability config](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_004.PNG?raw=true)

* check summary on for recover params
![Action export](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_005.PNG?raw=true)

![summary](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_006.PNG?raw=true)

* And finally complete fields on method keycloak method init app module provider and go to angular application `http://localhost:4200/` for check that automatically  redirect to authentication provider and then comeback to client if you aren't  authenticated
![login](https://github.com/julnarot/general-public-assets/blob/main/screenshots/keycloak_first_ng_open_id_client_007.PNG?raw=true)


## Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via a platform of your choice. To use this command, you need to first add a package that implements end-to-end testing capabilities.

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI Overview and Command Reference](https://angular.io/cli) page.
