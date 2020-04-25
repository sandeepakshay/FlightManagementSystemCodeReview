package com.capgemini.project.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.project.entities.Airport;
import com.capgemini.project.entities.Flight;
import com.capgemini.project.entities.Schedule;
import com.capgemini.project.entities.ScheduledFlight;
import com.capgemini.project.entities.Search;
import com.capgemini.project.entities.Users;
import com.capgemini.project.exceptions.ScheduleException;

@Repository
public class ScheduleDaoImp implements ScheduleDao {

	@PersistenceContext
	EntityManager em;

	public void add(Schedule schedule) {

		em.persist(schedule);

	}

	public void addScheduled(ScheduledFlight scheduleflight) {

		em.persist(scheduleflight);
	}

	public List<Object> viewAirportCode() {

		String str = "select Airport_Code from Airport airport";
		Query query = em.createNativeQuery(str);
		List<Object> list = query.getResultList();
		return list;

	}

	public List<Object> viewFlightNum() {

		String str = "select FlightNumber from Flight flight";
		Query query = em.createQuery(str);
		List<Object> list = query.getResultList();
		return list;

	}

	public List<Object> viewScheduleIds() {

		String str = "select ScheduleId from Schedule schedule";
		Query query = em.createQuery(str);
		List<Object> list = query.getResultList();
		return list;

	}

	public List<Schedule> viewAllSchedule() {

		String str = "select schedule from Schedule schedule";
		TypedQuery<Schedule> query = em.createQuery(str, Schedule.class);
		List<Schedule> list = query.getResultList();
		if (list.isEmpty())
			throw new ScheduleException("No Scheduled Flights Found !");
		else
			return list;

	}

	public void delete(int id) {

		Schedule schedule = em.find(Schedule.class, id);
		if (schedule == null)
			throw new ScheduleException("No Such ID found to delete!");
		else
			em.remove(schedule);
		em.flush();

	}

	public Schedule findById(int id) {

		Schedule schedule = em.find(Schedule.class, id);
		return schedule;

	}

	public void update(int id, Schedule schedule) {

		Schedule schedule1 = em.find(Schedule.class, id);
		schedule1.setScheduleId(schedule.getScheduleId());
		schedule1.setFlight(schedule.getFlight());
		schedule1.setSourceAirport(schedule.getSourceAirport());
		schedule1.setDestinationAirport(schedule.getDestinationAirport());
		schedule1.setArrivalTime(schedule.getArrivalTime());
		schedule1.setArrivalTime(schedule.getArrivalTime());
		schedule1.setAvailableSeats(schedule.getAvailableSeats());
		em.persist(schedule1);

	}

	public List<Schedule> searchScheduledFlights(Search search) {

		String str = "SELECT schedule from Schedule schedule WHERE :dDate=schedule.DepartureTime AND :sAirport=schedule.sourceAirport AND :dAirport=schedule.destinationAirport";
		TypedQuery<Schedule> query = em.createQuery(str, Schedule.class);
		query.setParameter("dDate", search.DeparturTime);
		query.setParameter("sAirport", search.sourceAirport);
		query.setParameter("dAirport", search.destinationAirport);
		List<Schedule> list = query.getResultList();
		return list;

	}

}
