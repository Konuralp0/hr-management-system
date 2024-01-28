package com.hrms.api.controllers;

import com.hrms.business.abstracts.JobSeekerService;
import com.hrms.core.utilities.results.DataResult;
import com.hrms.core.utilities.results.Result;
import com.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
  public Result registerJobSeeker(@RequestBody JobSeeker jobSeeker) {
    return jobSeekerService.add(jobSeeker);
  }

  @GetMapping("/{id}")
  public DataResult<JobSeeker> getJobSeekerById(@PathVariable Long id) {
    return jobSeekerService.getById(id);
  }



}
