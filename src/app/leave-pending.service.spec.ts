import { TestBed } from '@angular/core/testing';

import { LeavePendingService } from './leave-pending.service';

describe('LeavePendingService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: LeavePendingService = TestBed.get(LeavePendingService);
    expect(service).toBeTruthy();
  });
});
