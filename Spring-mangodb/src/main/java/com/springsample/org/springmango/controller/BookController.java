package com.springsample.org.springmango.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsample.org.springmango.model.Book;
import com.springsample.org.springmango.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	private BookRepository repository;
	@PostMapping("/addbook")
	public String saveBook(@RequestBody Book book)
	{
		repository.save(book);
		return "Added book with id:" + book.getId();
	}
	@GetMapping("/getbooks")
	public List<Book> getBooks()
	{
		return repository.findAll();
	}
	
	@GetMapping("/getbyid/{id}")
		public Optional<Book> getBook(@PathVariable int id)
		{
			return repository.findById(id);
		}
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id,@RequestBody Book book)
	{
	   repository.deleteById(id);	
		return "Book is deleted with id:" +book.getId();
	}
	

}
