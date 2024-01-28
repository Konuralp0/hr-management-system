package com.hrms.data_access;

import com.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

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
}
