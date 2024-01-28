package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.core.utilities.results.SuccessResult;
import com.hrms.data_access.JobPositionDAO;
import com.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Job position manager.
 */
@Service
public class JobPositionManager implements JobPositionService {


  private JobPositionDAO jobPositionDAO;

  /**
   * Instantiates a new Job position manager.
   *
   * @param jobPositionDAO the job position dao
   */
  @Autowired
  public JobPositionManager(JobPositionDAO jobPositionDAO) {
    this.jobPositionDAO = jobPositionDAO;
  }

  @Override
  public DataResult<List<JobPosition>> getAll() {
    return new SuccessDataResult<List<JobPosition>>(jobPositionDAO.findAll(),"Data retrieved successfully");
  }

  @Override
  public Result add(JobPosition jobPosition) {
    jobPositionDAO.save(jobPosition);
    return new SuccessResult("Job Position added");
  }
}
