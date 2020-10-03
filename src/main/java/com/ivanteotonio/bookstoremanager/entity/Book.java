package com.ivanteotonio.bookstoremanager.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //cria get e set
@Builder //para construção de objetos
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false)
	private Integer pages;
	
	@Column(nullable = false)
	private Integer chapters;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(name = "publisher_name", nullable = false, unique = true)
	private String publisherName;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})//um livro sempre vai ter un autor e um autor varios livros
    @JoinColumn(name = "autor_id")//qual coluna vai ser a chave estrangeira
	private Author author;
	//para fazer a consulta ele precisa fazer um join cascade é para toda vez que ele inserir um livro ele inserir um autor

   public void author() {
	 author.getName();
   }
}
