package ar.edu.ucc.arqsoft.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="TICKET")
public class Ticket extends GenericObject {
	
	@Enumerated(EnumType.ORDINAL) // en vez de guardar en la tabla "En proceso", guarda el numero de "En proceso"
	@Column(name = "TICKET_STATE", nullable = false) 
	private TicketState ticketState;
	
	@Column(name = "DATE", nullable = false) 
	private Date date;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transitions") //en minuscula porque es la instancia
	private Set<Transition> transitions = new HashSet<Transition>(); //Set es como List

	@Column(name = "TITLE", length = 600 , nullable = false) 
	private String title;
	
	@ManyToOne(fetch = FetchType.LAZY) // por default es recomendable lazy
	@JoinColumn(name="CREATOR_ID", nullable = false) // asi se hace el mapeo manyToOne
	private User creator;
	
	@ManyToOne(fetch = FetchType.LAZY) // por default es recomendable lazy
	@JoinColumn(name="ALLOCATOR_ID", nullable = true) // asi se hace el mapeo manyToOne
	private User allocator;

	public TicketState getTicketState() {
		return ticketState;
	}

	public void setTicketState(TicketState ticketState) {
		this.ticketState = ticketState;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public User getAllocator() {
		return allocator;
	}

	public void setAllocator(User allocator) {
		this.allocator = allocator;
	}
	
	public Set<Transition> getTransitions() {
		return transitions;
	}

	public void setTransitions(Set<Transition> transitions) {
		this.transitions = transitions;
	}
	
}
