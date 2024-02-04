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

  /**
   * Gets employer by id.
   *
   * @param id the id
   * @return the employer by id
   */
  DataResult<Employer> getEmployerById(long id);

  /**
   * Gets employer by company name.
   *
   * @param companyName the company name
   * @return the employer by company name
   */
  DataResult<Employer> getEmployerByCompanyName(String companyName);

  /**
   * Gets employer by email.
   *
   * @param email the email
   * @return the employer by email
   */
  DataResult<Employer> getEmployerByEmail(String email);

}
