package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobPositionsController {

  @Autowired
  private JobPositionService jobPositionService;


  @GetMapping("/job-positions")
  public DataResult<List<JobPosition>> getAll(){
    return jobPositionService.getAll();
  }


  @PostMapping("/job-positions")
  public Result add(@RequestBody JobPosition jobPosition){
    return jobPositionService.add(jobPosition);
  }


}
