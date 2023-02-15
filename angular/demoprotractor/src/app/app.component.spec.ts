import { TestBed, async } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { RouterTestingModule } from '@angular/router/testing';

import { AppComponent } from './app.component';
import { ItemService } from './item.service';

describe('AppComponent', () => {
  let service: ItemService;
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
      providers: [
        ItemService
      ]
    }).compileComponents();
  }));
  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ItemService);
  });

  it('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'demoprotractor'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('demoprotractor');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('demoprotractor app is running!');
  });

  it('should render item added', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const newItem = "new item";
    service.addItem(newItem);
    const app = fixture.componentInstance
    app.items = service.getItems();
    fixture.whenStable().then(()=> {
      fixture.detectChanges();
      const lastLi: any = fixture.debugElement.queryAll(By.css('.items li')).pop();
      expect(lastLi.nativeElement.textContent).toContain(newItem);
    });
  });
});
