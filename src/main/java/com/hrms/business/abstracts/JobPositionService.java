package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
  DataResult<List<JobPosition>> getAll();
}
