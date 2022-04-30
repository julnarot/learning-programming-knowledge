import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
  {
    path: 'windows-info',
    loadChildren: () => import('./modules/window-info/window-info.module')
      .then(m => m.WindowInfoModule)
  }, {
    path: 'circles',
    loadChildren: () => import('./modules/circle/circle.module')
      .then(m => m.CircleModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
