package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Employer;

import java.util.List;

/**
 * The interface Employer service.
 */
public interface EmployerService {
  /**
   * Gets all.
   *
   * @return the all
   */
  DataResult<List<Employer>> getAll();

  /**
   * Add result.
   *
   * @param employer the employer
   * @return the result
   */
  Result add(Employer employer);

}
