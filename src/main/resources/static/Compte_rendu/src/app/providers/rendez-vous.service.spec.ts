import { TestBed, inject } from '@angular/core/testing';

import { RendezVousService } from './rendez-vous.service';

describe('RendezVousService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [RendezVousService]
    });
  });

  it('should be created', inject([RendezVousService], (service: RendezVousService) => {
    expect(service).toBeTruthy();
  }));
});
