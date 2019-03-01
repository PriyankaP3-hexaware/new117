import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RoutedemoComponent } from './routedemo.component';

describe('RoutedemoComponent', () => {
  let component: RoutedemoComponent;
  let fixture: ComponentFixture<RoutedemoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RoutedemoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RoutedemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
