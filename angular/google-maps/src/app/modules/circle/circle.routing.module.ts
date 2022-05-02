import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {CircleComponent} from "./circle.component";


const routes: Routes = [
  {
    path: '',
    component: CircleComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})

export class CircleRoutingModule {

}
