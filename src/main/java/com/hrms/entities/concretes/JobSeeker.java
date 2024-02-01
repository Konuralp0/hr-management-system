package com.hrms.entities.concretes;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * The type Job seeker.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_seekers")
public class JobSeeker {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long id;

  @NotBlank(message = "First name is required")
  @Column(name = "first_name")
  private String firstName;

  @NotBlank(message = "Last name is required")
  @Column(name = "last_name")
  private String lastName;

  @NotBlank(message = "TC number is required")
  @Pattern(regexp = "\\d{11}", message = "TC number must be 11 digits")
  @Column(name = "tc_no")
  private String tcNo;

  @Column(name = "birth_year")
  private int birthYear;

  @NotBlank(message = "Email is required")
  @Email(message = "Invalid email format")
  @Column(name = "email" )
  private String email;

  @NotBlank(message = "Password is required")
  @Column(name = "password")
  private String password;
}
