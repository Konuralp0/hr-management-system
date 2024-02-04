package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobPosition;


import java.util.List;

/**
 * The interface Job position service.
 */
public interface JobPositionService {
  /**
   * Gets all.
   *
   * @return the all
   */
  DataResult<List<JobPosition>> getAll();

  /**
   * Add result.
   *
   * @param jobPosition the job position
   * @return the result
   */
  Result add(JobPosition jobPosition) ;

  /**
   * Gets all.
   *
   * @param pageNo   the page no
   * @param pageSize the page size
   * @return the all
   */
  DataResult<List<JobPosition>> getAll(int pageNo, int pageSize);
}
