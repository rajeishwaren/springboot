package com.example.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.books;
import com.example.service.bookService;

@RestController
@RequestMapping(value ="/user")
public class bookController {
	
	@Autowired
	bookService    bookservice;
	
	@GetMapping("/book")  
	public List<books> getAllBooks()
	{
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/book/{bookId}")
	private Optional<books> getBook(@PathVariable("bookId") int bookId){
		
		return bookservice.getbook(bookId);
	}
	
	@DeleteMapping("/book/{bookId}")
	private void deleteBook(@PathVariable("bookId") int bookId) {
		
		 bookservice.deleteBook(bookId);
	}
	
	@PostMapping("/books")
	private void saveBook(books savebook) {
		
		 bookservice.saveBook(savebook);
	}
	
	@PutMapping("/books")
	private void updateBook(books savebook) {
		
		 bookservice.updateBook(savebook);
	}

}
