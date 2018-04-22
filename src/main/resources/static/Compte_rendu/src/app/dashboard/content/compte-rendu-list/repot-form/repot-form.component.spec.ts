import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RepotFormComponent } from './repot-form.component';

describe('RepotFormComponent', () => {
  let component: RepotFormComponent;
  let fixture: ComponentFixture<RepotFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RepotFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RepotFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
