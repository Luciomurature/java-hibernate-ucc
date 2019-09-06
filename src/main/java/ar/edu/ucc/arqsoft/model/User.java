package ar.edu.ucc.arqsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity // esto significa que cuando levanta la configuracion tiene que hacer una tabla de esto
@Table(name = "USER")
public class User extends GenericObject {
	
	
	
	
	@Column(name = "FIRST NAME", length=300, nullable = false) //decimos que es una columna con esas propiedades
	private String firstName;
	
	@Column(name = "LAST NAME", length=300, nullable = false) 
	private String lastName;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
}
