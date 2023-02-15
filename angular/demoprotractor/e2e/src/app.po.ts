import { browser, by, element } from 'protractor';

export class AppPage {
  navigateTo(): Promise<unknown> {
    return browser.get(browser.baseUrl) as Promise<unknown>;
  }

  getTitleText(): Promise<string> {
    return element(by.css('app-root .content span')).getText() as Promise<string>;
  }

  getButtonSave() {
    return element(by.css('app-root .on-save'))
  }
  getInputSave() {
    return element(by.id('itemName'));
  }
  getInputSaveValue() {
    // const input =  element(by.css('app-root input'));

    // const item = element(by.id('itemName'))
    // // console.log(input);
    // // console.log('TTTTTTTTTTTT',input.getText());
    // console.log('->>>>>>>>>>',item.getAttribute('value'));
    // // console.log('->>>>>>>>>>',item.getAttribute('value'));
    // // console.log(input.element);

    // console.log('VALLLLL',input.value);
    // // console.log(input.native);
    // return input.nativeElement.value;
    return element(by.id('itemName'));
  }
}
