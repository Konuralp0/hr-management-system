package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobPositionService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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




}
