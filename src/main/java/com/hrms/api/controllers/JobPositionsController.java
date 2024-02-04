package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.ErrorDataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobPosition;
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
 * The type Job positions controller.
 */
@RestController
@RequestMapping("/api/job-positions")
public class JobPositionsController {

  @Autowired
  private JobPositionService jobPositionService;


  /**
   * Get all data result.
   *
   * @return the data result
   */
  @GetMapping
  public DataResult<List<JobPosition>> getAll(){
    return jobPositionService.getAll();
  }


  /**
   * Add result.
   *
   * @param jobPosition the job position
   * @return the result
   */
  @PostMapping
  public Result add(@Valid @RequestBody JobPosition jobPosition){
    return jobPositionService.add(jobPosition);
  }

  @GetMapping("/getAllByPage")
  DataResult<List<JobPosition>> getAll(int pageNo, int pageSize){
    return jobPositionService.getAll(pageNo,pageSize);
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
