import { TestBed } from '@angular/core/testing';

import { AcademicDetailsService } from './academic-details.service';

describe('AcademicDetailsService', () => {
  let service: AcademicDetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AcademicDetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
