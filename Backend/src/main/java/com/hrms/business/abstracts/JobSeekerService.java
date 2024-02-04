package com.hrms.business.abstracts;

import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobPosition;
import com.hrms.entities.concretes.JobSeeker;

import java.util.List;

/**
 * The interface Job seeker service.
 */
public interface JobSeekerService {

  /**
   * Gets all.
   *
   * @return the all
   */
  DataResult<List<JobSeeker>> getAll();


  /**
   * Add result.
   *
   * @param jobSeeker the job seeker
   * @return the result
   */
  Result add(JobSeeker jobSeeker);

  /**
   * Gets by id.
   *
   * @param id the id
   * @return the by id
   */
  DataResult<JobSeeker> getById(Long id);

  /**
   * Find by email data result.
   *
   * @param email the email
   * @return the data result
   */
  DataResult<JobSeeker> findByEmail(String email);

  /**
   * Find by first name data result.
   *
   * @param firstName the first name
   * @return the data result
   */
  DataResult<List<JobSeeker>> findByFirstName(String firstName);


}
