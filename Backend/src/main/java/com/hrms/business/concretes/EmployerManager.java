package com.hrms.business.concretes;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.ErrorDataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.core.utilities.results.SuccessDataResult;
import com.hrms.data_access.EmployerDAO;
import com.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The type Employer manager.
 */
@Service
public class EmployerManager implements EmployerService {

  @Autowired
  private EmployerDAO employerDAO;

  @Override
  public DataResult<List<Employer>> getAll() {
    List<Employer> employers = employerDAO.findAll();
    return new SuccessDataResult<>(employers, "Data retrieved successfully");
  }

  @Override
  public Result add(Employer employer) {
    if (!isInputValid(employer)) {
      return new ErrorDataResult<>("Invalid input. Please provide all required information.");
    }

    if (employerDAO.existsByEmail(employer.getEmail())) {
      return new ErrorDataResult<>("A user with the same email already exists.");
    }



    employerDAO.save(employer);
    return new SuccessDataResult<>("Employer added");
  }

  @Override
  public DataResult<Employer> getEmployerById(long id) {
    return new SuccessDataResult<Employer>(employerDAO.getEmployerById(id));
  }

  @Override
  public DataResult<Employer> getEmployerByCompanyName(String companyName) {
    return new SuccessDataResult<Employer>(employerDAO.getEmployerByCompanyName(companyName));
  }

  @Override
  public DataResult<Employer> getEmployerByEmail(String email) {
    return new SuccessDataResult<Employer>(employerDAO.getEmployerByEmail(email));
  }

  private boolean isInputValid(Employer employer) {
    return employer != null &&
            employer.getCompanyName() != null &&
            employer.getWebsite() != null &&
            employer.getEmail() != null &&
            employer.getPhone() != null &&
            employer.getPassword() != null;
  }
}

