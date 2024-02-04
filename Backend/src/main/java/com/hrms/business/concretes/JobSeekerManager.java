package com.hrms.business.concretes;

import com.hrms.business.abstracts.JobSeekerService;
import com.hrms.core.utilities.results.*;
import com.hrms.data_access.JobSeekerDAO;
import com.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Job seeker manager.
 */
@Service
public class JobSeekerManager implements JobSeekerService {

  @Autowired
  private JobSeekerDAO jobSeekerDAO;

  @Override
  public DataResult<List<JobSeeker>> getAll() {
    return new SuccessDataResult<>(jobSeekerDAO.findAll(), "Data retrieved successfully");
  }

  @Override
  public Result add(JobSeeker jobSeeker) {
    if (!isInputValid(jobSeeker)) {
      return new ErrorResult("Invalid input. Please provide all required information.");
    }

    if (isTcNoOrEmailRegistered(jobSeeker.getTcNo(), jobSeeker.getEmail())) {
      return new ErrorResult("A user with the same TC number or email already exists.");
    }

    jobSeekerDAO.save(jobSeeker);
    return new SuccessResult("Job seeker added");
  }

  @Override
  public DataResult<JobSeeker> getById(Long id) {
    JobSeeker jobSeeker = jobSeekerDAO.findById(id).orElse(null);
    if (jobSeeker != null) {
      return new SuccessDataResult<>(jobSeeker, "Job seeker found");
    } else {
      return new ErrorDataResult<>(null,"Job seeker not found");
    }
  }

  @Override
  public DataResult<JobSeeker> findByEmail(String email) {
    JobSeeker jobSeeker = jobSeekerDAO.findByEmail(email);
    if (jobSeeker != null) {
      return new SuccessDataResult<>(jobSeeker, "Job seeker found");
    } else {
      return new ErrorDataResult<>(null,"Job seeker not found");
    }
  }

  @Override
  public DataResult<List<JobSeeker>> findByFirstName(String firstName) {
    List<JobSeeker> jobSeekers = jobSeekerDAO.findByFirstName(firstName);
    if (!jobSeekers.isEmpty()) {
      return new SuccessDataResult<>(jobSeekers, "Job seeker found");
    } else {
      return new ErrorDataResult<>(null,"Job seeker not found");
    }
  }

  private boolean isInputValid(JobSeeker jobSeeker) {
    return jobSeeker != null &&
            jobSeeker.getFirstName() != null &&
            jobSeeker.getLastName() != null &&
            jobSeeker.getTcNo() != null &&
            jobSeeker.getBirthYear() > 0 &&
            jobSeeker.getEmail() != null &&
            jobSeeker.getPassword() != null;
  }

  private boolean isTcNoOrEmailRegistered(String tcNo, String email) {
    return jobSeekerDAO.existsByTcNoOrEmail(tcNo, email);
  }
}
