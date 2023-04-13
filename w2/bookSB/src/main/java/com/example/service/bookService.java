package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.booksRepository;
import com.example.model.books;

@Service
public class bookService {
	
	@Autowired
	booksRepository  booksrepository;

	public List<books> getAllBooks() {
		
		List<books> books = new ArrayList<books>();
		booksrepository.findAll().forEach(onebook -> books.add(onebook));
		return books;
	}

	public Optional<books> getbook(int bookId) {
		
		return booksrepository.findById(bookId);
	}

	public void deleteBook(int bookId) {
		
		booksrepository.deleteById(bookId);
	}

	public void saveBook(books savebook) {
		booksrepository.save(savebook);
	}

	public void updateBook(books savebook) {
       booksrepository.save(savebook);
	}

}
