package com.hrms.entities.concretes;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employers")
public class Employer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Integer id;

  @Column(name = "company_name" )
  @NotBlank(message = "Company name is required")
  private String companyName;

  @Column(name ="website" )
  @NotBlank(message = "Website is required")
  private String website;

  @Column(name ="email" )
  @NotBlank(message = "Email is required")
  @Email(message = "Invalid email format")
  private String email;

  @Column(name = "phone")
  @NotBlank(message = "Phone number is required")
  private String phone;

  @Column(name = "password")
  @NotBlank(message = "Password is required")
  private String password;

  @Column(name = "is_approved")
  private boolean isApproved;


}
