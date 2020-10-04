package com.ivanteotonio.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivanteotonio.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
