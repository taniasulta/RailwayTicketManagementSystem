package com.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Price;
import com.spring.model.Schedule;
import com.spring.model.Train;
import com.spring.common.ICommonService;
import com.spring.dao.ScheduleDao;
@Service(value="scheduleService")
public class ScheduleService implements ICommonService<Schedule>{
	@Autowired
	ScheduleDao scheduleDao;
	@Override
	public Schedule save(HttpServletRequest request) {
		String name=request.getParameter("train_name");
		Schedule sc=new Schedule();
		
		sc.setTrain_name(name);;
		sc.setRoad_name(request.getParameter("road_name"));
		sc.setDeparter_time(request.getParameter("departer_time"));
		sc.setArrival_time(request.getParameter("arrival_time"));
		sc.setReturn_road(request.getParameter("return_road"));
		sc.setReturn_departur(request.getParameter("return_departur"));
		sc.setReturn_arrival(request.getParameter("return_arrival"));
		
		return scheduleDao.save(sc);
	}

	@Override
	public Schedule edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Schedule> getAll() {
		return scheduleDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Train> trainall() {
		return scheduleDao.trainall();
	}

	
}
