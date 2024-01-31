package com.hrms.api.controllers;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {

  @Autowired
  private EmployerService employerService;

  @GetMapping
  public DataResult<List<Employer>> getAllEmployers() {
    return employerService.getAll();
  }

  @PostMapping
  public Result registerEmployer(@RequestBody Employer employer) {
    return employerService.add(employer);
  }


  public DataResult<Employer> getEmployerById(long id){
    return employerService.getEmployerById(id);
  }


 public DataResult<Employer> getEmployerByCompanyName(String companyName){
    return employerService.getEmployerByCompanyName(companyName);
 }


 public DataResult<Employer> getEmployerByEmail(String email){
    return employerService.getEmployerByEmail(email);
 }
}
