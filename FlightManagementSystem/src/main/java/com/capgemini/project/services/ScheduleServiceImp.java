package com.capgemini.project.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.capgemini.project.Dao.ScheduleDao;
import com.capgemini.project.Dao.ScheduleDaoImp;
import com.capgemini.project.entities.Airport;
import com.capgemini.project.entities.Flight;
import com.capgemini.project.entities.Schedule;
import com.capgemini.project.entities.ScheduledFlight;
import com.capgemini.project.entities.Search;
import com.capgemini.project.entities.Users;

@Transactional
@Service
public class ScheduleServiceImp implements ScheduleService {

	@Autowired
	ScheduleDao dao;

	public void add(Schedule schedule) {

		dao.add(schedule);
	}

	public void addScheduled(ScheduledFlight scheduleflight) {

		dao.addScheduled(scheduleflight);
	}

	public List<Object> viewAirportCode() {

		return dao.viewAirportCode();
	}

	public List<Object> viewFlightNum() {

		return dao.viewFlightNum();
	}

	public List<Object> viewScheduleIds() {

		return dao.viewScheduleIds();
	}

	public List<Schedule> viewAllSchedule() {

		return dao.viewAllSchedule();
	}

	public void delete(int id) {

		dao.delete(id);
	}

	public void update(int id, Schedule schedule) {

		dao.update(id, schedule);
	}

	public Schedule findById(int id) {

		return dao.findById(id);
	}

	public List<Schedule> searchScheduledFlights(Search search) {

		return dao.searchScheduledFlights(search);
	}

}
