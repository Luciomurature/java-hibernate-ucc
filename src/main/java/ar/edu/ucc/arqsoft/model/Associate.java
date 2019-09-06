package ar.edu.ucc.arqsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Associate")
public class Associate extends GenericObject {
	
	@Column(name="First Name", length = 20, nullable = true)
	private String firstName;
	
	@Column(name="Last Name", length = 20, nullable = false)
	private String lastName;
	
	@Column(name="First Name", nullable = false)
	private long dni;

	
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

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
}
