import { ChangeDetectionStrategy, Component } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { Observable, of } from 'rxjs';
import { filter, map, shareReplay, switchMap } from 'rxjs/operators';
import { BkLayout } from '@uibakery/kit';
import * as AppActions from './state/app.actions';
import * as fromApp from './state/app.reducer';
import { Store } from '@ngrx/store';
import { NbThemeService, NbMediaBreakpoint } from '@nebular/theme';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
  changeDetection: ChangeDetectionStrategy.OnPush,
})
export class AppComponent {

  defaultLayout: BkLayout = {
    paddings: {
      paddingTop: 16,
      paddingRight: 16,
      paddingBottom: 16,
      paddingLeft: 16,
      paddingTopUnit: "px",
      paddingRightUnit: "px",
      paddingBottomUnit: "px",
      paddingLeftUnit: "px"
    },
    header: true,
    sidebar: true
  };

  layout$: Observable<BkLayout> = this.router.events
    .pipe(
      filter(event => event instanceof NavigationEnd),
      map(() => {
        let route = this.router.routerState.root;
        while (route.firstChild) {
          route = route.firstChild;
        }
        return route.snapshot.data['layout'] || this.defaultLayout;
      }),
      shareReplay(),
    );

  padding$: Observable<string> = this.layout$
    .pipe(
      map((layout: BkLayout) => this.getPaddingCssValue(layout.paddings)),
    );

  src$ = this.themeService.onMediaQueryChange().pipe(
    switchMap(([, breakpoint]) => this.getCurrentValue(breakpoint, 'src')),
  );

  responsiveConfig = 
  {
    "320": {
      "src": of(`./assets/images/logo - 600x600.png`)
    },
    "1024": {
      "src": of(`./assets/images/logo@1x.png`)
    }
  };

  items = [
  	{
  		title: 'Student',
  		link: '/Student'
  	},
  	{
  		title: 'Student Profile',
  		link: '/Student-Profile'
  	},
  	{
  		title: 'Student  Details',
  		link: '/Student-Details'
  	},
  	{
  		title: 'Hostel',
  		link: '/Hostel'
  	},
  	{
  		title: 'Student list',
  		link: '/Student-list'
  	},
  	{
  		title: 'Search',
  		link: '/Search'
  	},
  	{
  		title: 'Teacher info',
  		link: '/Teacher-info'
  	},
  	{
  		title: 'Teacher  Details',
  		link: '/Teacher-Details'
  	},
  	{
  		title: 'Teacher  list',
  		link: '/Teacher-list'
  	},
  	{
  		title: 'Class info',
  		link: '/Class-info'
  	},
  	{
  		title: 'Subjects',
  		link: '/Subjects'
  	},
  	{
  		title: 'Attendance',
  		link: '/Attendance'
  	},
  	{
  		title: 'Payment',
  		link: '/Payment'
  	},
  	{
  		title: 'Sign up',
  		link: '/Sign-up'
  	},
  	{
  		title: 'Log in',
  		link: '/Log-in'
  	},
  	{
  		title: 'Forgot password',
  		link: '/Forgot-password'
  	},
  	{
  		title: 'Page not found',
  		link: '/Page-not-found'
  	}
  ];

  constructor(private themeService: NbThemeService,
              private store: Store<fromApp.State>,
    private router: Router) {
  }  
  
  private getCurrentValue(breakpoint: NbMediaBreakpoint, propName: string, ...itemsArgs: any[]): string {
    const bpConfig = this.responsiveConfig[breakpoint.width];
    let result; 
    if (bpConfig && bpConfig[propName]) {
      result = bpConfig[propName];
    } else {
      result = this.getParentBreakpointValue(breakpoint, propName);
    }
    if (itemsArgs.length) {
      return result(...itemsArgs);
    }
    return result;
  }
  
  private getParentBreakpointValue(breakpoint: NbMediaBreakpoint, propName: string): string {
    let result: string;
    for (const bp of Object.keys(this.responsiveConfig)) {
      if (+bp > breakpoint.width && !!this.responsiveConfig[bp][propName]) {
        result = this.responsiveConfig[bp][propName];
        break;
      }
    }
    return result;
  }

  toggleSidebar(event) {
    this.store.dispatch(AppActions.toggleSidebar({ param: event }));
  }

  private getPaddingCssValue(paddings): string {
    return `${paddings.paddingTop}${paddings.paddingTopUnit} ` +
           `${paddings.paddingRight}${paddings.paddingRightUnit} ` +
           `${paddings.paddingBottom}${paddings.paddingBottomUnit} ` +
           `${paddings.paddingLeft}${paddings.paddingLeftUnit}`;
  }
}
