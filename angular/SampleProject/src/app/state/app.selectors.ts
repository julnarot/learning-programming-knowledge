import { createFeatureSelector, createSelector } from '@ngrx/store';

import * as fromApp from './app.reducer';
import * as fromRouter from '@ngrx/router-store';

  
export const getRouterState = createFeatureSelector<any>('router');

export const {
  selectCurrentRoute,   // select the current route
  selectQueryParams,    // select the current route query params
  selectQueryParam,     // factory function to select a query param
  selectRouteParams,    // select the current route params
  selectRouteParam,     // factory function to select a route param
  selectRouteData,      // select the current route data
  selectUrl,            // select the current url
} = fromRouter.getSelectors(getRouterState);

export const getActiveRoute = createSelector(selectUrl, selectQueryParams, (url, queryParams) => {
  return { url, queryParams };
});


export const getAppState = createFeatureSelector<fromApp.State>('app');

export const getUiInput = createSelector(getAppState, (state: fromApp.State) => state.uiInput);

export const getUiInput1 = createSelector(getAppState, (state: fromApp.State) => state.uiInput1);

export const getUiCheckbox7 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox7);

export const getUiCheckbox8 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox8);

export const getUiCheckbox9 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox9);

export const getUiCheckbox10 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox10);

export const getUiInput31 = createSelector(getAppState, (state: fromApp.State) => state.uiInput31);

export const getUiCheckbox11 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox11);

export const getUiCheckbox12 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox12);

export const getUiCheckbox13 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox13);

export const getUiInput32 = createSelector(getAppState, (state: fromApp.State) => state.uiInput32);

export const getUiInput4 = createSelector(getAppState, (state: fromApp.State) => state.uiInput4);

export const getUiInput5 = createSelector(getAppState, (state: fromApp.State) => state.uiInput5);

export const getUiSelect = createSelector(getAppState, (state: fromApp.State) => state.uiSelect);

export const getUiSelect1 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect1);

export const getUiInput6 = createSelector(getAppState, (state: fromApp.State) => state.uiInput6);

export const getUiInput3 = createSelector(getAppState, (state: fromApp.State) => state.uiInput3);

export const getUiCheckbox = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox);

export const getUiCheckbox1 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox1);

export const getUiInput341 = createSelector(getAppState, (state: fromApp.State) => state.uiInput341);

export const getUiCheckbox2 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox2);

export const getUiCheckbox3 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox3);

export const getUiCheckbox17 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox17);

export const getUiCheckbox18 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox18);

export const getUiCheckbox19 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox19);

export const getUiInput8 = createSelector(getAppState, (state: fromApp.State) => state.uiInput8);

export const getUiInput9 = createSelector(getAppState, (state: fromApp.State) => state.uiInput9);

export const getUiSelect2 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect2);

export const getUiSelect3 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect3);

export const getUiInput10 = createSelector(getAppState, (state: fromApp.State) => state.uiInput10);

export const getUiInput13 = createSelector(getAppState, (state: fromApp.State) => state.uiInput13);

export const getUiSelect5 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect5);

export const getUiInput16 = createSelector(getAppState, (state: fromApp.State) => state.uiInput16);

export const getUiDatepicker = createSelector(getAppState, (state: fromApp.State) => state.uiDatepicker);

export const getUiInput17 = createSelector(getAppState, (state: fromApp.State) => state.uiInput17);

export const getUiInput11 = createSelector(getAppState, (state: fromApp.State) => state.uiInput11);

export const getUiInput14 = createSelector(getAppState, (state: fromApp.State) => state.uiInput14);

export const getUiInput15 = createSelector(getAppState, (state: fromApp.State) => state.uiInput15);

export const getUiSelect7 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect7);

export const getUiSelect4 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect4);

export const getUiSelect6 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect6);

export const getUiInput12 = createSelector(getAppState, (state: fromApp.State) => state.uiInput12);

export const getUiInput34 = createSelector(getAppState, (state: fromApp.State) => state.uiInput34);

export const getUiCheckbox20 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox20);

export const getUiCheckbox21 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox21);

export const getUiCheckbox22 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox22);

export const getUiCheckbox23 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox23);

export const getUiCheckbox24 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox24);

export const getUiSelect14 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect14);

export const getUiSelect15 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect15);

export const getUiSelect16 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect16);

export const getUiSelect17 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect17);

export const getUiInput36 = createSelector(getAppState, (state: fromApp.State) => state.uiInput36);

export const getUiInput19 = createSelector(getAppState, (state: fromApp.State) => state.uiInput19);

export const getUiInput20 = createSelector(getAppState, (state: fromApp.State) => state.uiInput20);

export const getUiSelect8 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect8);

export const getUiSelect9 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect9);

export const getUiInput18 = createSelector(getAppState, (state: fromApp.State) => state.uiInput18);

export const getUiCheckbox4 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox4);

export const getUiCheckbox5 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox5);

export const getUiCheckbox25 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox25);

export const getUiCheckbox26 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox26);

export const getUiCheckbox27 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox27);

export const getUiSelect13 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect13);

export const getUiSelect12 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect12);

export const getUiSelect10 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect10);

export const getUiSelect11 = createSelector(getAppState, (state: fromApp.State) => state.uiSelect11);

export const getUiInput21 = createSelector(getAppState, (state: fromApp.State) => state.uiInput21);

export const getUiInput22 = createSelector(getAppState, (state: fromApp.State) => state.uiInput22);

export const getUiInput35 = createSelector(getAppState, (state: fromApp.State) => state.uiInput35);

export const getUiInput23 = createSelector(getAppState, (state: fromApp.State) => state.uiInput23);

export const getUiInput24 = createSelector(getAppState, (state: fromApp.State) => state.uiInput24);

export const getUiInput25 = createSelector(getAppState, (state: fromApp.State) => state.uiInput25);

export const getUiInput26 = createSelector(getAppState, (state: fromApp.State) => state.uiInput26);

export const getUiCheckbox6 = createSelector(getAppState, (state: fromApp.State) => state.uiCheckbox6);

export const getUiInput27 = createSelector(getAppState, (state: fromApp.State) => state.uiInput27);

export const getUiInput28 = createSelector(getAppState, (state: fromApp.State) => state.uiInput28);

export const getUiInput29 = createSelector(getAppState, (state: fromApp.State) => state.uiInput29);

