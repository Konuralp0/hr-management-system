package com.hrms.data_access;

import com.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * The interface Job seeker dao.
 */
public interface JobSeekerDAO extends JpaRepository<JobSeeker,Long> {
  /**
   * Find by email job seeker.
   *
   * @param email the email
   * @return the job seeker
   */
  JobSeeker findByEmail(String email);

  /**
   * Find by first name list.
   *
   * @param firstName the first name
   * @return the list
   */
  List<JobSeeker> findByFirstName(String firstName);

  /**
   * Find by last name list.
   *
   * @param lastName the last name
   * @return the list
   */
  List<JobSeeker> findByLastName(String lastName);

  /**
   * Find by first name and last name list.
   *
   * @param firstName the first name
   * @param lastName  the last name
   * @return the list
   */
  List<JobSeeker> findByFirstNameAndLastName(String firstName, String lastName);

  /**
   * Find by tc no job seeker.
   *
   * @param tcNo the tc no
   * @return the job seeker
   */
  JobSeeker findByTcNo(String tcNo);

  /**
   * Find by birth year list.
   *
   * @param birthYear the birth year
   * @return the list
   */
  List<JobSeeker> findByBirthYear(int birthYear);

  /**
   * Find by email and password job seeker.
   *
   * @param email    the email
   * @param password the password
   * @return the job seeker
   */
  JobSeeker findByEmailAndPassword(String email, String password);

  /**
   * Find by email ignore case and password ignore case job seeker.
   *
   * @param email    the email
   * @param password the password
   * @return the job seeker
   */
  JobSeeker findByEmailIgnoreCaseAndPasswordIgnoreCase(String email, String password);

  /**
   * Exists by tc no or email boolean.
   *
   * @param tcNo  the tc no
   * @param email the email
   * @return the boolean
   */
  boolean existsByTcNoOrEmail(String tcNo, String email);

}
