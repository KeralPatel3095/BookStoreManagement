package com.keral.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.keral.bookstore.service.MyBookService;

@Controller
public class MyBookListController {

	@Autowired
	private MyBookService myservice;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id) {
		myservice.deleteById(id);
		return "redirect:/my_books";
	}
}
