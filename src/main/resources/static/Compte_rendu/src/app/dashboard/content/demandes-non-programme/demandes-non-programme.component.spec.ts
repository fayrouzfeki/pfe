import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DemandesNonProgrammeComponent } from './demandes-non-programme.component';

describe('DemandesNonProgrammeComponent', () => {
  let component: DemandesNonProgrammeComponent;
  let fixture: ComponentFixture<DemandesNonProgrammeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DemandesNonProgrammeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DemandesNonProgrammeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
