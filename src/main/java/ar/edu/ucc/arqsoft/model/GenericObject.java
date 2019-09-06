package ar.edu.ucc.arqsoft.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass

public class GenericObject {

	private Long id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //se va a generar con una identidad
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
