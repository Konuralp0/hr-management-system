package com.hrms.data_access;

import com.hrms.entities.concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * The interface Job position dao.
 */
public interface JobPositionDAO extends JpaRepository<JobPosition,Long> {

  /**
   * Find by position name list.
   *
   * @param positionName the position name
   * @return the list
   */
  List<JobPosition> findByPositionName(String positionName);


  /**
   * Find by position name ignore case list.
   *
   * @param positionName the position name
   * @return the list
   */
  List<JobPosition> findByPositionNameIgnoreCase(String positionName);


  /**
   * Find by position name containing list.
   *
   * @param keyword the keyword
   * @return the list
   */
  List<JobPosition> findByPositionNameContaining(String keyword);


  /**
   * Find by position name starting with list.
   *
   * @param prefix the prefix
   * @return the list
   */
  List<JobPosition> findByPositionNameStartingWith(String prefix);


  /**
   * Find by position name ending with list.
   *
   * @param suffix the suffix
   * @return the list
   */
  List<JobPosition> findByPositionNameEndingWith(String suffix);


  /**
   * Find by position name order by position name asc list.
   *
   * @param positionName the position name
   * @return the list
   */
  List<JobPosition> findByPositionNameOrderByPositionNameAsc(String positionName);


  /**
   * Find by position name order by position name desc list.
   *
   * @param positionName the position name
   * @return the list
   */
  List<JobPosition> findByPositionNameOrderByPositionNameDesc(String positionName);


  /**
   * Find top 5 by position name list.
   *
   * @param positionName the position name
   * @return the list
   */
  List<JobPosition> findTop5ByPositionName(String positionName);


}
