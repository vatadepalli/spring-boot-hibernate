package org.mdt.hb.repository.library;

import org.mdt.hb.model.library.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * BookRepository
 */
public interface BookRepository extends JpaRepository<Book, Integer> {

}