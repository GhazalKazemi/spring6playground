package com.ghazal.spring6webapp.bootstrap;

import com.ghazal.spring6webapp.entity.Author;
import com.ghazal.spring6webapp.entity.Book;
import com.ghazal.spring6webapp.entity.Publisher;
import com.ghazal.spring6webapp.repositories.AuthorRepository;
import com.ghazal.spring6webapp.repositories.BookRepository;
import com.ghazal.spring6webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author firstAuthor = new Author();
        firstAuthor.setFirstName("Eric");
        firstAuthor.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author savedFirstAuthor = authorRepository.save(firstAuthor);
        Book savedFirstBook = bookRepository.save(ddd);

        Author secondAuthor = new Author();
        secondAuthor.setFirstName("Rod");
        secondAuthor.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("654321");

        Author savedSecondAuthor = authorRepository.save(secondAuthor);
        Book savedSecondBook = bookRepository.save(noEJB);

        savedFirstAuthor.getBooks().add(ddd);
        savedSecondAuthor.getBooks().add(noEJB);
        savedFirstBook.getAuthors().add(firstAuthor);
        savedSecondBook.getAuthors().add(secondAuthor);

        authorRepository.save(savedFirstAuthor);
        authorRepository.save(savedSecondAuthor);

        Publisher firstPublisher = new Publisher();

        firstPublisher.setPublisherName("Book Publisher");
        firstPublisher.setAddress("123 Somewhere Road");
        firstPublisher.setCity("Melbourne");
        firstPublisher.setState("VIC");
        firstPublisher.setPostCode("3000");

        Publisher savedFirstPublisher = publisherRepository.save(firstPublisher);

        savedFirstBook.setPublisher(savedFirstPublisher);
        savedSecondBook.setPublisher(savedFirstPublisher);
        bookRepository.save(savedFirstBook);
        bookRepository.save(savedSecondBook);


        System.out.println("Bootstrapping Data:");
        System.out.println("Authors: " + authorRepository.count());
        System.out.println("Books: " + bookRepository.count());
        System.out.println("Publisher: " + publisherRepository.count());


    }
}
