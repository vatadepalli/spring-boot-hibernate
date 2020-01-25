package org.mdt.hb.repository.acts;

import org.mdt.hb.model.acts.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StudentRepository
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}