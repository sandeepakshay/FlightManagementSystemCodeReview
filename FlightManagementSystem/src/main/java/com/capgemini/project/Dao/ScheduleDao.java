package com.capgemini.project.Dao;

import java.util.List;

import com.capgemini.project.entities.Airport;
import com.capgemini.project.entities.Flight;
import com.capgemini.project.entities.Schedule;
import com.capgemini.project.entities.ScheduledFlight;
import com.capgemini.project.entities.Search;

public interface ScheduleDao {

	public void add(Schedule schedule);

	public void addScheduled(ScheduledFlight scheduleflight);

	public List<Object> viewAirportCode();

	public List<Object> viewFlightNum();

	public List<Object> viewScheduleIds();

	public List<Schedule> viewAllSchedule();

	public void delete(int id);

	public void update(int id, Schedule schedule);

	public Schedule findById(int id);

	public List<Schedule> searchScheduledFlights(Search search);

}
