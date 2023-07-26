package com.keral.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keral.bookstore.model.Book;
import com.keral.bookstore.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookrepo;

	public BookRepository getBookrepo() {
		return bookrepo;
	}

	public void setBookrepo(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	

	public void save(Book b) {
		bookrepo.save(b);
	}
	
	public List<Book> getAllBooks(){
		return bookrepo.findAll();
	}
	
	public Book getBookById(int id) {
		return bookrepo.findById(id).get();
	}
	
	public void deleteById(int id) {
		 bookrepo.deleteById(id);
	}

}
