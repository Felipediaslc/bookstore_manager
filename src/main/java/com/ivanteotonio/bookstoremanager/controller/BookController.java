package com.ivanteotonio.bookstoremanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivanteotonio.bookstoremanager.dto.MessageResponseDTO;
import com.ivanteotonio.bookstoremanager.entity.Book;
import com.ivanteotonio.bookstoremanager.repository.BookRepository;
import com.ivanteotonio.bookstoremanager.service.BookService;

@RestController
@RequestMapping("api/v1/books")//onde vai ser o acesso ao controller
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@PostMapping
	public MessageResponseDTO create(@RequestBody Book book) {
	     return bookService.create(book);
	}

}
