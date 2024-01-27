package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.data_access.JobPositionDAO;
import com.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {


  private JobPositionDAO jobPositionDAO;

  @Autowired
  public JobPositionManager(JobPositionDAO jobPositionDAO) {
    this.jobPositionDAO = jobPositionDAO;
  }

  @Override
  public DataResult<List<JobPosition>> getAll() {
    return new SuccessDataResult<List<JobPosition>>(jobPositionDAO.findAll(),"Data retrieved");
  }
}
