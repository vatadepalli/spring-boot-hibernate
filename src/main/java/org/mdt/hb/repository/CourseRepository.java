package org.mdt.hb.repository;

import org.mdt.hb.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CourseRepository
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}