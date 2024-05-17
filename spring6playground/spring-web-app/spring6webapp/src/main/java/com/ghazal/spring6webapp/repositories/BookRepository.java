package com.ghazal.spring6webapp.repositories;

import com.ghazal.spring6webapp.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
