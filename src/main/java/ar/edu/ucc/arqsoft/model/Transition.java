package ar.edu.ucc.arqsoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TRANSITION")
public class Transition extends GenericObject {
	
	@Column(name = "DATE", nullable = false) 
	private Date date;
	
	@ManyToOne(fetch = FetchType.LAZY) // por default es recomendable lazy
	@JoinColumn(name="TICKER_ID", nullable = false) // asi se hace el mapeo manyToOne
	private Ticket ticket;
	
	@Enumerated(EnumType.ORDINAL) // en vez de guardar en la tabla "En proceso", guarda el numero de "En proceso"
	@Column(name = "LAST_STATE", nullable = false) 
	private TicketState lastState;
	
	@Enumerated(EnumType.ORDINAL) // en vez de guardar en la tabla "En proceso", guarda el numero de "En proceso"
	@Column(name = "NEW_STATE", nullable = false) 
	private TicketState newState;
	
	@Column(name = "COMENTARY",length = 300, nullable = true) 
	private String comentary;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public TicketState getLastState() {
		return lastState;
	}

	public void setLastState(TicketState lastState) {
		this.lastState = lastState;
	}

	public TicketState getNewState() {
		return newState;
	}

	public void setNewState(TicketState newState) {
		this.newState = newState;
	}

	public String getComentary() {
		return comentary;
	}

	public void setComentary(String comentary) {
		this.comentary = comentary;
	}
	
	
	
}
