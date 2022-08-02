package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotBlank(message = "O atributo título é Obrigatório!")
	 @Size(min = 3, max = 255, message = "O atributo título deve conter no miíimo 03 e no máximo 100 caracteres")
	 private String titulo;
	 
	 @NotBlank(message = "O atributo título é Obrigatório!")
	 @Size(min = 5, max = 1000,  message = "O atributo título deve conter no miíimo 05 e no máximo 1000 caracteres")
	 private String texto;
	 
	 @UpdateTimestamp
	 private LocalDateTime data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}
	 

}

