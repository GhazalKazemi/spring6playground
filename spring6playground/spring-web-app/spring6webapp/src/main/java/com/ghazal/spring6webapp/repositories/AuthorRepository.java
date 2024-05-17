package com.ghazal.spring6webapp.repositories;

import com.ghazal.spring6webapp.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
