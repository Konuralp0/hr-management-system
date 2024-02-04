package com.hrms.api.controllers;

import com.hrms.business.abstracts.EmployerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.ErrorDataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.Employer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employers")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployersController {

  @Autowired
  private EmployerService employerService;

  @GetMapping
  public DataResult<List<Employer>> getAllEmployers() {
    return employerService.getAll();
  }

  @PostMapping
  public ResponseEntity<?> registerEmployer(@Valid @RequestBody Employer employer) {
    return ResponseEntity.ok(employerService.add(employer));
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

  @ExceptionHandler(MethodArgumentNotValidException.class)
  @ResponseStatus(HttpStatus.BAD_REQUEST)
  public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exception){
    Map<String,String> validationsError = new HashMap<>();
    for (FieldError fieldError : exception.getBindingResult().getFieldErrors()){
      validationsError.put(fieldError.getField(), fieldError.getDefaultMessage());
    }
    ErrorDataResult<Object> errorDataResult = new ErrorDataResult<>(validationsError,"Dogrulama hatalari");
    return errorDataResult;
  }
}
