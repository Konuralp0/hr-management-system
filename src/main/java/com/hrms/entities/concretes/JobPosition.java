package com.hrms.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Job position.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_positions")
public class JobPosition {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "position_id", columnDefinition = "BIGINT")
  private Long positionId;

  @Column(name = "position_name", unique = true, nullable = false)
  private String positionName;
}
