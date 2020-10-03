package com.ivanteotonio.bookstoremanager.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data //cria get e set
@Builder //para construção de objetos
@NoArgsConstructor
@AllArgsConstructor
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//gera um id auto incrente
	private Long id;
	
	@Column(nullable = false, unique = true)//não vai permitir valor unico e valor unico
	private String name;
	
	@Column(nullable = false)
	private Integer age;
	
    
}
