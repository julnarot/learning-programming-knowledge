import { Injectable, Inject } from '@angular/core';
import { Actions, createEffect, ofType } from '@ngrx/effects';
import { Observable } from 'rxjs';
import * as AppActions from './app.actions';
import { tap, map, share } from 'rxjs/operators';
import { NbSidebarService } from '@nebular/theme';

@Injectable()
export class AppEffects {

  private toggleSidebar$: Observable<any> = createEffect(() => this.actions$.pipe(
    ofType(AppActions.toggleSidebar.type),
    map((action: { param: any }) => action.param),
    tap(() => this.sidebarService.toggle()),
    share(),
  ), { dispatch: false });

  constructor(private sidebarService: NbSidebarService,
    private actions$: Actions) {
  }

}
