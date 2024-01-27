package com.hrms.data_access;

import com.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;



public interface JobPositionDAO extends JpaRepository<JobPosition,Long> {
}
