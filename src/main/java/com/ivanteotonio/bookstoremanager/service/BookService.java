package com.ivanteotonio.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ivanteotonio.bookstoremanager.dto.MessageResponseDTO;
import com.ivanteotonio.bookstoremanager.entity.Book;
import com.ivanteotonio.bookstoremanager.repository.BookRepository;

@Service
public class BookService {
	
    private BookRepository bookRepository;
	
    @Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
    
	public MessageResponseDTO create( Book book) {
		Book saveBook = bookRepository.save(book);//salva um livro
		return MessageResponseDTO.builder()
				.message("Livro criado com id: "+saveBook.getId())
				.build();
	}

}
