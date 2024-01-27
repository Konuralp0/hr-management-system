package com.hrms.data_access;

import com.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface JobPositionDAO extends JpaRepository<JobPosition,Long> {
}
