package ar.edu.ucc.arqsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="DVD")
public class Dvd extends GenericObject {
	
	@Enumerated(EnumType.STRING)
	@Column(name="Genre", nullable = true)
	private DvdGenre genre;
	
	@Column(name="Title",length = 50 ,nullable =  false)
	private String title;
	
	@Column(name="Description", length = 500, nullable = true)
	private String description;
	
	@Column(name="Duration",length=10 ,nullable = true)
	private int duration;
	
	

	public DvdGenre getGenre() {
		return genre;
	}

	public void setGenre(DvdGenre genre) {
		this.genre = genre;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	

}
