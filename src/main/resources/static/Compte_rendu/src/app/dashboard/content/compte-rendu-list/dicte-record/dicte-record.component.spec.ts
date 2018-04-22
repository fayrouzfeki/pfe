import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DicteRecordComponent } from './dicte-record.component';

describe('DicteRecordComponent', () => {
  let component: DicteRecordComponent;
  let fixture: ComponentFixture<DicteRecordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DicteRecordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DicteRecordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
