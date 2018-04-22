import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RapportMedicalComponent } from './rapport-medical.component';

describe('RapportMedicalComponent', () => {
  let component: RapportMedicalComponent;
  let fixture: ComponentFixture<RapportMedicalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RapportMedicalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RapportMedicalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
