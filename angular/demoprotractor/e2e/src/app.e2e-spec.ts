import { AppPage } from './app.po';
import { browser, logging } from 'protractor';

describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getTitleText()).toEqual('demoprotractor app is running!');
  });

  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
});

describe('Adding new item', function() {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should add a todo', function() {
    // browser.get('https://angularjs.org');

    const firstItem = "firstItem";
    page.navigateTo();

    // element(by.model('todoList.todoText')).sendKeys('write first protractor test');

    page.getInputSave().sendKeys(firstItem);
    // input.va
    page.getButtonSave().click();
    // console.log("jejeejJEEJEJ");
    // console.log(page.getInputSaveValue())

    expect(page.getInputSave().getAttribute('value')).toEqual(firstItem);

    // var todoList = element.all(by.repeater('todo in todoList.todos'));
    // expect(todoList.count()).toEqual(3);
    // expect(todoList.get(2).getText()).toEqual('write first protractor test');

    // // You wrote your first test, cross it off the list
    // todoList.get(2).element(by.css('input')).click();
    // var completedAmount = element.all(by.css('.done-true'));
    // expect(completedAmount.count()).toEqual(2);
  });
});
