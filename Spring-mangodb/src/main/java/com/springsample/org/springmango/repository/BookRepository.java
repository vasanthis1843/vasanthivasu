package com.springsample.org.springmango.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springsample.org.springmango.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
