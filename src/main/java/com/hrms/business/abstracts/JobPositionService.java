package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.entities.concretes.JobPosition;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface JobPositionService {
  DataResult<List<JobPosition>> getAll();

  Result add(@RequestBody JobPosition jobPosition) ;
}
