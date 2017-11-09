import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BankComponent } from './bank.component';

describe('BankComponent', () => {
  let component: BankComponent;
  let fixture: ComponentFixture<BankComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BankComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BankComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
