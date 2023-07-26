package com.keral.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keral.bookstore.model.MyBookList;
import com.keral.bookstore.repository.MyBookRepository;

@Service
public class MyBookService {
	
	@Autowired
	private MyBookRepository myrepo;
	
	public void saveMyBooks(MyBookList book) {
		myrepo.save(book);
		
	}
	public List<MyBookList> getAllMyBooks(){
		return myrepo.findAll();
	}
	public void deleteById(int id) {
		myrepo.deleteById(id);
	}
}
