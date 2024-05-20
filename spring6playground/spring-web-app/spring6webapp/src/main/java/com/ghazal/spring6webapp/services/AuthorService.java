package com.ghazal.spring6webapp.services;

import com.ghazal.spring6webapp.entity.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
