package org.mdt.hb.repository.blog;

import org.mdt.hb.model.blog.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PostRepository
 */
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}