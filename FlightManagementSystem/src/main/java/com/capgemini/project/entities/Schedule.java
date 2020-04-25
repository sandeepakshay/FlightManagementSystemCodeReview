package com.capgemini.project.entities;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Schedule")
public class Schedule implements Serializable {

    @Id
	public int ScheduleId;

	@ManyToOne
	@JoinColumn(name = "SourceAirportCode", referencedColumnName = "AirportCode")
	@Autowired
	public Airport sourceAirport;

	@ManyToOne
	@JoinColumn(name = "DestAirportCode", referencedColumnName = "AirportCode")
	@Autowired
	public Airport destinationAirport;

	
	public String ArrivalTime;
	public String DepartureTime;

	@JoinColumn(name = "flight", referencedColumnName = "FlightNumber")
	@ManyToOne(optional = false)
	@Autowired
	Flight flight;

	int availableSeats;

	int ticketCost;

	public int getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Schedule() {
	}

	public Schedule(int ScheduledId) {

		this.ScheduleId = ScheduleId;

	}

	public Schedule(int ScheduleId, Airport sourceAirport, Airport destinationAirport, String ArrivalTime,
			String DepartureTime, Flight flight, int availableSeats, int ticketCost) {

		this.ScheduleId = ScheduleId;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;

		this.ArrivalTime = ArrivalTime;
		this.DepartureTime = DepartureTime;
		this.flight = flight;
		this.availableSeats = availableSeats;
		this.ticketCost = ticketCost;

	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public int getScheduleId() {
		return ScheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.ScheduleId = scheduleId;
	}

	public Airport getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(Airport sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public Airport getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(Airport destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public String getArrivalTime() {
		return ArrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return DepartureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.DepartureTime = departureTime;
	}

}
