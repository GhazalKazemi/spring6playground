package com.ghazal.spring6webapp.services;

import com.ghazal.spring6webapp.entity.Book;

public interface BookService {

    Iterable<Book> findAll();
}
