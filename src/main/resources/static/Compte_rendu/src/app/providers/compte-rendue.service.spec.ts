import { TestBed, inject } from '@angular/core/testing';

import { CompteRendueService } from './compte-rendue.service';

describe('CompteRendueService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CompteRendueService]
    });
  });

  it('should be created', inject([CompteRendueService], (service: CompteRendueService) => {
    expect(service).toBeTruthy();
  }));
});
