package com.hrms.data_access;

import com.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Employer dao.
 */
public interface EmployerDAO extends JpaRepository<Employer,Long> {
  /**
   * Exists by email boolean.
   *
   * @param email the email
   * @return the boolean
   */
  boolean existsByEmail(String email);


  /**
   * Gets employer by id.
   *
   * @param id the id
   * @return the employer by id
   */
  Employer getEmployerById(long id);

  /**
   * Gets employer by company name.
   *
   * @param companyName the company name
   * @return the employer by company name
   */
  Employer getEmployerByCompanyName(String companyName);

  /**
   * Gets employer by email.
   *
   * @param email the email
   * @return the employer by email
   */
  Employer getEmployerByEmail(String email);



}
