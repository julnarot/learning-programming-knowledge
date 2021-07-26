import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {FormularioSegurosComponent} from "./components/formulario-seguros/formulario-seguros.component";
import {ListarSegurosComponent} from "./components/listar-seguros/listar-seguros.component";

const routes: Routes = [
  {
    path: 'formulario', component: FormularioSegurosComponent
  },
  {
    path: 'listar', component: ListarSegurosComponent
  },
  {
    path: '*', pathMatch: 'full', redirectTo: 'formulario'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
