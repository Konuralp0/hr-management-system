package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobSeekerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.ErrorDataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobSeeker;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The type Job seekers controller.
 */
@RestController
@RequestMapping("/api/job-seekers")
public class JobSeekersController {

  @Autowired
  private JobSeekerService jobSeekerService;

  /**
   * Gets all job seekers.
   *
   * @return the all job seekers
   */
  @GetMapping
  public DataResult<List<JobSeeker>> getAllJobSeekers() {
    return jobSeekerService.getAll();
  }

  /**
   * Register job seeker result.
   *
   * @param jobSeeker the job seeker
   * @return the result
   */
  @PostMapping
  public Result registerJobSeeker(@Valid @RequestBody JobSeeker jobSeeker) {
    return jobSeekerService.add(jobSeeker);
  }

  @GetMapping("/{id}")
  public DataResult<JobSeeker> getJobSeekerById(@PathVariable Long id) {
    return jobSeekerService.getById(id);
  }
  @GetMapping("/findByEmail")
  public DataResult<JobSeeker> findByEmail(@RequestParam String email){
    return jobSeekerService.findByEmail(email);
  }
  @GetMapping("/findByName")
  public DataResult<List<JobSeeker>> findByFirstName(@RequestParam String firstName){
    return jobSeekerService.findByFirstName(firstName);

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
