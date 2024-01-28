package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
  public Result add(@RequestBody JobPosition jobPosition){
    return jobPositionService.add(jobPosition);
  }


}
