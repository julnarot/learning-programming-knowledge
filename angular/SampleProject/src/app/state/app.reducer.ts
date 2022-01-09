import { createReducer, on } from '@ngrx/store';

import * as AppActions from './app.actions';

export interface State {
  uiInput29: {
      value: any;
  };
  uiInput28: {
      value: any;
  };
  uiInput27: {
      value: any;
  };
  uiCheckbox6: {
      value: any;
  };
  uiInput26: {
      value: any;
  };
  uiInput25: {
      value: any;
  };
  uiInput24: {
      value: any;
  };
  uiInput23: {
      value: any;
  };
  uiInput35: {
      value: any;
  };
  uiInput22: {
      value: any;
  };
  uiInput21: {
      value: any;
  };
  uiSelect11: {
      value: any;
  };
  uiSelect10: {
      value: any;
  };
  uiSelect12: {
      value: any;
  };
  uiSelect13: {
      value: any;
  };
  uiCheckbox27: {
      value: any;
  };
  uiCheckbox26: {
      value: any;
  };
  uiCheckbox25: {
      value: any;
  };
  uiCheckbox5: {
      value: any;
  };
  uiCheckbox4: {
      value: any;
  };
  uiInput18: {
      value: any;
  };
  uiSelect9: {
      value: any;
  };
  uiSelect8: {
      value: any;
  };
  uiInput20: {
      value: any;
  };
  uiInput19: {
      value: any;
  };
  uiInput36: {
      value: any;
  };
  uiSelect17: {
      value: any;
  };
  uiSelect16: {
      value: any;
  };
  uiSelect15: {
      value: any;
  };
  uiSelect14: {
      value: any;
  };
  uiCheckbox24: {
      value: any;
  };
  uiCheckbox23: {
      value: any;
  };
  uiCheckbox22: {
      value: any;
  };
  uiCheckbox21: {
      value: any;
  };
  uiCheckbox20: {
      value: any;
  };
  uiInput34: {
      value: any;
  };
  uiInput12: {
      value: any;
  };
  uiSelect6: {
      value: any;
  };
  uiSelect4: {
      value: any;
  };
  uiSelect7: {
      value: any;
  };
  uiInput15: {
      value: any;
  };
  uiInput14: {
      value: any;
  };
  uiInput11: {
      value: any;
  };
  uiInput17: {
      value: any;
  };
  uiDatepicker: {
      value: any;
  };
  uiInput16: {
      value: any;
  };
  uiSelect5: {
      value: any;
  };
  uiInput13: {
      value: any;
  };
  uiInput10: {
      value: any;
  };
  uiSelect3: {
      value: any;
  };
  uiSelect2: {
      value: any;
  };
  uiInput9: {
      value: any;
  };
  uiInput8: {
      value: any;
  };
  uiCheckbox19: {
      value: any;
  };
  uiCheckbox18: {
      value: any;
  };
  uiCheckbox17: {
      value: any;
  };
  uiCheckbox3: {
      value: any;
  };
  uiCheckbox2: {
      value: any;
  };
  uiInput341: {
      value: any;
  };
  uiCheckbox1: {
      value: any;
  };
  uiCheckbox: {
      value: any;
  };
  uiInput3: {
      value: any;
  };
  uiInput6: {
      value: any;
  };
  uiSelect1: {
      value: any;
  };
  uiSelect: {
      value: any;
  };
  uiInput5: {
      value: any;
  };
  uiInput4: {
      value: any;
  };
  uiInput32: {
      value: any;
  };
  uiCheckbox13: {
      value: any;
  };
  uiCheckbox12: {
      value: any;
  };
  uiCheckbox11: {
      value: any;
  };
  uiInput31: {
      value: any;
  };
  uiCheckbox10: {
      value: any;
  };
  uiCheckbox9: {
      value: any;
  };
  uiCheckbox8: {
      value: any;
  };
  uiCheckbox7: {
      value: any;
  };
  uiInput1: {
      value: any;
  };
  uiInput: {
      value: any;
  };
}

const initialState: State = {
  uiInput29: {
      value: '',
  },
  uiInput28: {
      value: '',
  },
  uiInput27: {
      value: '',
  },
  uiCheckbox6: {
      value: false,
  },
  uiInput26: {
      value: '',
  },
  uiInput25: {
      value: '',
  },
  uiInput24: {
      value: '',
  },
  uiInput23: {
      value: '',
  },
  uiInput35: {
      value: '',
  },
  uiInput22: {
      value: '',
  },
  uiInput21: {
      value: '',
  },
  uiSelect11: {
      value: '',
  },
  uiSelect10: {
      value: '',
  },
  uiSelect12: {
      value: '',
  },
  uiSelect13: {
      value: '',
  },
  uiCheckbox27: {
      value: false,
  },
  uiCheckbox26: {
      value: false,
  },
  uiCheckbox25: {
      value: false,
  },
  uiCheckbox5: {
      value: false,
  },
  uiCheckbox4: {
      value: false,
  },
  uiInput18: {
      value: '',
  },
  uiSelect9: {
      value: '',
  },
  uiSelect8: {
      value: '',
  },
  uiInput20: {
      value: '',
  },
  uiInput19: {
      value: '',
  },
  uiInput36: {
      value: '',
  },
  uiSelect17: {
      value: '',
  },
  uiSelect16: {
      value: '',
  },
  uiSelect15: {
      value: '',
  },
  uiSelect14: {
      value: '',
  },
  uiCheckbox24: {
      value: false,
  },
  uiCheckbox23: {
      value: false,
  },
  uiCheckbox22: {
      value: false,
  },
  uiCheckbox21: {
      value: false,
  },
  uiCheckbox20: {
      value: false,
  },
  uiInput34: {
      value: '',
  },
  uiInput12: {
      value: '',
  },
  uiSelect6: {
      value: '',
  },
  uiSelect4: {
      value: '',
  },
  uiSelect7: {
      value: '',
  },
  uiInput15: {
      value: '',
  },
  uiInput14: {
      value: '',
  },
  uiInput11: {
      value: '',
  },
  uiInput17: {
      value: '',
  },
  uiDatepicker: {
      value: new Date(),
  },
  uiInput16: {
      value: '',
  },
  uiSelect5: {
      value: '',
  },
  uiInput13: {
      value: '',
  },
  uiInput10: {
      value: '',
  },
  uiSelect3: {
      value: '',
  },
  uiSelect2: {
      value: '',
  },
  uiInput9: {
      value: '',
  },
  uiInput8: {
      value: '',
  },
  uiCheckbox19: {
      value: false,
  },
  uiCheckbox18: {
      value: false,
  },
  uiCheckbox17: {
      value: false,
  },
  uiCheckbox3: {
      value: false,
  },
  uiCheckbox2: {
      value: false,
  },
  uiInput341: {
      value: '',
  },
  uiCheckbox1: {
      value: false,
  },
  uiCheckbox: {
      value: false,
  },
  uiInput3: {
      value: '',
  },
  uiInput6: {
      value: '',
  },
  uiSelect1: {
      value: '',
  },
  uiSelect: {
      value: '',
  },
  uiInput5: {
      value: '',
  },
  uiInput4: {
      value: '',
  },
  uiInput32: {
      value: '',
  },
  uiCheckbox13: {
      value: false,
  },
  uiCheckbox12: {
      value: false,
  },
  uiCheckbox11: {
      value: false,
  },
  uiInput31: {
      value: '',
  },
  uiCheckbox10: {
      value: false,
  },
  uiCheckbox9: {
      value: false,
  },
  uiCheckbox8: {
      value: false,
  },
  uiCheckbox7: {
      value: false,
  },
  uiInput1: {
      value: '',
  },
  uiInput: {
      value: '',
  },
};

export const reducer = createReducer(
  initialState,
  on(AppActions.updateUiInput29, (state: State, changes) => ({ ...state, uiInput29: { ...state.uiInput29, ...changes.param }})),
  on(AppActions.updateUiInput28, (state: State, changes) => ({ ...state, uiInput28: { ...state.uiInput28, ...changes.param }})),
  on(AppActions.updateUiInput27, (state: State, changes) => ({ ...state, uiInput27: { ...state.uiInput27, ...changes.param }})),
  on(AppActions.updateUiCheckbox6, (state: State, changes) => ({ ...state, uiCheckbox6: { ...state.uiCheckbox6, ...changes.param }})),
  on(AppActions.updateUiInput26, (state: State, changes) => ({ ...state, uiInput26: { ...state.uiInput26, ...changes.param }})),
  on(AppActions.updateUiInput25, (state: State, changes) => ({ ...state, uiInput25: { ...state.uiInput25, ...changes.param }})),
  on(AppActions.updateUiInput24, (state: State, changes) => ({ ...state, uiInput24: { ...state.uiInput24, ...changes.param }})),
  on(AppActions.updateUiInput23, (state: State, changes) => ({ ...state, uiInput23: { ...state.uiInput23, ...changes.param }})),
  on(AppActions.updateUiInput35, (state: State, changes) => ({ ...state, uiInput35: { ...state.uiInput35, ...changes.param }})),
  on(AppActions.updateUiInput22, (state: State, changes) => ({ ...state, uiInput22: { ...state.uiInput22, ...changes.param }})),
  on(AppActions.updateUiInput21, (state: State, changes) => ({ ...state, uiInput21: { ...state.uiInput21, ...changes.param }})),
  on(AppActions.updateUiSelect11, (state: State, changes) => ({ ...state, uiSelect11: { ...state.uiSelect11, ...changes.param }})),
  on(AppActions.updateUiSelect10, (state: State, changes) => ({ ...state, uiSelect10: { ...state.uiSelect10, ...changes.param }})),
  on(AppActions.updateUiSelect12, (state: State, changes) => ({ ...state, uiSelect12: { ...state.uiSelect12, ...changes.param }})),
  on(AppActions.updateUiSelect13, (state: State, changes) => ({ ...state, uiSelect13: { ...state.uiSelect13, ...changes.param }})),
  on(AppActions.updateUiCheckbox27, (state: State, changes) => ({ ...state, uiCheckbox27: { ...state.uiCheckbox27, ...changes.param }})),
  on(AppActions.updateUiCheckbox26, (state: State, changes) => ({ ...state, uiCheckbox26: { ...state.uiCheckbox26, ...changes.param }})),
  on(AppActions.updateUiCheckbox25, (state: State, changes) => ({ ...state, uiCheckbox25: { ...state.uiCheckbox25, ...changes.param }})),
  on(AppActions.updateUiCheckbox5, (state: State, changes) => ({ ...state, uiCheckbox5: { ...state.uiCheckbox5, ...changes.param }})),
  on(AppActions.updateUiCheckbox4, (state: State, changes) => ({ ...state, uiCheckbox4: { ...state.uiCheckbox4, ...changes.param }})),
  on(AppActions.updateUiInput18, (state: State, changes) => ({ ...state, uiInput18: { ...state.uiInput18, ...changes.param }})),
  on(AppActions.updateUiSelect9, (state: State, changes) => ({ ...state, uiSelect9: { ...state.uiSelect9, ...changes.param }})),
  on(AppActions.updateUiSelect8, (state: State, changes) => ({ ...state, uiSelect8: { ...state.uiSelect8, ...changes.param }})),
  on(AppActions.updateUiInput20, (state: State, changes) => ({ ...state, uiInput20: { ...state.uiInput20, ...changes.param }})),
  on(AppActions.updateUiInput19, (state: State, changes) => ({ ...state, uiInput19: { ...state.uiInput19, ...changes.param }})),
  on(AppActions.updateUiInput36, (state: State, changes) => ({ ...state, uiInput36: { ...state.uiInput36, ...changes.param }})),
  on(AppActions.updateUiSelect17, (state: State, changes) => ({ ...state, uiSelect17: { ...state.uiSelect17, ...changes.param }})),
  on(AppActions.updateUiSelect16, (state: State, changes) => ({ ...state, uiSelect16: { ...state.uiSelect16, ...changes.param }})),
  on(AppActions.updateUiSelect15, (state: State, changes) => ({ ...state, uiSelect15: { ...state.uiSelect15, ...changes.param }})),
  on(AppActions.updateUiSelect14, (state: State, changes) => ({ ...state, uiSelect14: { ...state.uiSelect14, ...changes.param }})),
  on(AppActions.updateUiCheckbox24, (state: State, changes) => ({ ...state, uiCheckbox24: { ...state.uiCheckbox24, ...changes.param }})),
  on(AppActions.updateUiCheckbox23, (state: State, changes) => ({ ...state, uiCheckbox23: { ...state.uiCheckbox23, ...changes.param }})),
  on(AppActions.updateUiCheckbox22, (state: State, changes) => ({ ...state, uiCheckbox22: { ...state.uiCheckbox22, ...changes.param }})),
  on(AppActions.updateUiCheckbox21, (state: State, changes) => ({ ...state, uiCheckbox21: { ...state.uiCheckbox21, ...changes.param }})),
  on(AppActions.updateUiCheckbox20, (state: State, changes) => ({ ...state, uiCheckbox20: { ...state.uiCheckbox20, ...changes.param }})),
  on(AppActions.updateUiInput34, (state: State, changes) => ({ ...state, uiInput34: { ...state.uiInput34, ...changes.param }})),
  on(AppActions.updateUiInput12, (state: State, changes) => ({ ...state, uiInput12: { ...state.uiInput12, ...changes.param }})),
  on(AppActions.updateUiSelect6, (state: State, changes) => ({ ...state, uiSelect6: { ...state.uiSelect6, ...changes.param }})),
  on(AppActions.updateUiSelect4, (state: State, changes) => ({ ...state, uiSelect4: { ...state.uiSelect4, ...changes.param }})),
  on(AppActions.updateUiSelect7, (state: State, changes) => ({ ...state, uiSelect7: { ...state.uiSelect7, ...changes.param }})),
  on(AppActions.updateUiInput15, (state: State, changes) => ({ ...state, uiInput15: { ...state.uiInput15, ...changes.param }})),
  on(AppActions.updateUiInput14, (state: State, changes) => ({ ...state, uiInput14: { ...state.uiInput14, ...changes.param }})),
  on(AppActions.updateUiInput11, (state: State, changes) => ({ ...state, uiInput11: { ...state.uiInput11, ...changes.param }})),
  on(AppActions.updateUiInput17, (state: State, changes) => ({ ...state, uiInput17: { ...state.uiInput17, ...changes.param }})),
  on(AppActions.updateUiDatepicker, (state: State, changes) => ({ ...state, uiDatepicker: { ...state.uiDatepicker, ...changes.param }})),
  on(AppActions.updateUiInput16, (state: State, changes) => ({ ...state, uiInput16: { ...state.uiInput16, ...changes.param }})),
  on(AppActions.updateUiSelect5, (state: State, changes) => ({ ...state, uiSelect5: { ...state.uiSelect5, ...changes.param }})),
  on(AppActions.updateUiInput13, (state: State, changes) => ({ ...state, uiInput13: { ...state.uiInput13, ...changes.param }})),
  on(AppActions.updateUiInput10, (state: State, changes) => ({ ...state, uiInput10: { ...state.uiInput10, ...changes.param }})),
  on(AppActions.updateUiSelect3, (state: State, changes) => ({ ...state, uiSelect3: { ...state.uiSelect3, ...changes.param }})),
  on(AppActions.updateUiSelect2, (state: State, changes) => ({ ...state, uiSelect2: { ...state.uiSelect2, ...changes.param }})),
  on(AppActions.updateUiInput9, (state: State, changes) => ({ ...state, uiInput9: { ...state.uiInput9, ...changes.param }})),
  on(AppActions.updateUiInput8, (state: State, changes) => ({ ...state, uiInput8: { ...state.uiInput8, ...changes.param }})),
  on(AppActions.updateUiCheckbox19, (state: State, changes) => ({ ...state, uiCheckbox19: { ...state.uiCheckbox19, ...changes.param }})),
  on(AppActions.updateUiCheckbox18, (state: State, changes) => ({ ...state, uiCheckbox18: { ...state.uiCheckbox18, ...changes.param }})),
  on(AppActions.updateUiCheckbox17, (state: State, changes) => ({ ...state, uiCheckbox17: { ...state.uiCheckbox17, ...changes.param }})),
  on(AppActions.updateUiCheckbox3, (state: State, changes) => ({ ...state, uiCheckbox3: { ...state.uiCheckbox3, ...changes.param }})),
  on(AppActions.updateUiCheckbox2, (state: State, changes) => ({ ...state, uiCheckbox2: { ...state.uiCheckbox2, ...changes.param }})),
  on(AppActions.updateUiInput341, (state: State, changes) => ({ ...state, uiInput341: { ...state.uiInput341, ...changes.param }})),
  on(AppActions.updateUiCheckbox1, (state: State, changes) => ({ ...state, uiCheckbox1: { ...state.uiCheckbox1, ...changes.param }})),
  on(AppActions.updateUiCheckbox, (state: State, changes) => ({ ...state, uiCheckbox: { ...state.uiCheckbox, ...changes.param }})),
  on(AppActions.updateUiInput3, (state: State, changes) => ({ ...state, uiInput3: { ...state.uiInput3, ...changes.param }})),
  on(AppActions.updateUiInput6, (state: State, changes) => ({ ...state, uiInput6: { ...state.uiInput6, ...changes.param }})),
  on(AppActions.updateUiSelect1, (state: State, changes) => ({ ...state, uiSelect1: { ...state.uiSelect1, ...changes.param }})),
  on(AppActions.updateUiSelect, (state: State, changes) => ({ ...state, uiSelect: { ...state.uiSelect, ...changes.param }})),
  on(AppActions.updateUiInput5, (state: State, changes) => ({ ...state, uiInput5: { ...state.uiInput5, ...changes.param }})),
  on(AppActions.updateUiInput4, (state: State, changes) => ({ ...state, uiInput4: { ...state.uiInput4, ...changes.param }})),
  on(AppActions.updateUiInput32, (state: State, changes) => ({ ...state, uiInput32: { ...state.uiInput32, ...changes.param }})),
  on(AppActions.updateUiCheckbox13, (state: State, changes) => ({ ...state, uiCheckbox13: { ...state.uiCheckbox13, ...changes.param }})),
  on(AppActions.updateUiCheckbox12, (state: State, changes) => ({ ...state, uiCheckbox12: { ...state.uiCheckbox12, ...changes.param }})),
  on(AppActions.updateUiCheckbox11, (state: State, changes) => ({ ...state, uiCheckbox11: { ...state.uiCheckbox11, ...changes.param }})),
  on(AppActions.updateUiInput31, (state: State, changes) => ({ ...state, uiInput31: { ...state.uiInput31, ...changes.param }})),
  on(AppActions.updateUiCheckbox10, (state: State, changes) => ({ ...state, uiCheckbox10: { ...state.uiCheckbox10, ...changes.param }})),
  on(AppActions.updateUiCheckbox9, (state: State, changes) => ({ ...state, uiCheckbox9: { ...state.uiCheckbox9, ...changes.param }})),
  on(AppActions.updateUiCheckbox8, (state: State, changes) => ({ ...state, uiCheckbox8: { ...state.uiCheckbox8, ...changes.param }})),
  on(AppActions.updateUiCheckbox7, (state: State, changes) => ({ ...state, uiCheckbox7: { ...state.uiCheckbox7, ...changes.param }})),
  on(AppActions.updateUiInput1, (state: State, changes) => ({ ...state, uiInput1: { ...state.uiInput1, ...changes.param }})),
  on(AppActions.updateUiInput, (state: State, changes) => ({ ...state, uiInput: { ...state.uiInput, ...changes.param }})),
);
