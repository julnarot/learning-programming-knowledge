import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersonAddComponent } from './components/person/person-add/person-add.component';
import { LoginComponent } from './components/login/login.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { HomeComponent } from './components/home/home.component';
import { PersonListComponent } from './components/person/person-list/person-list.component';
import { PersonEditComponent } from './components/person/person-edit/person-edit.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: 'login',
    pathMatch: 'full',
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'persons',
    component: PersonListComponent,
    children: [
      {
        path: 'add',
        component: PersonAddComponent,
      },
      {
        path: ':id',
        component: PersonEditComponent,
      },
    ],
  },

  {
    path: '**',
    component: NotFoundComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
