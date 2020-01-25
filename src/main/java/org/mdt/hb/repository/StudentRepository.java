package org.mdt.hb.repository;

import org.mdt.hb.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}