package org.mdt.hb.repository;

import org.mdt.hb.model.blog.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TagRepository
 */
@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}