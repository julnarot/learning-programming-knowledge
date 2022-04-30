import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {WindowInfoComponent} from "./window-info.component";

const routes: Routes = [
  {
    path: '',
    component: WindowInfoComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class WindowInfoRoutingModule {
}
