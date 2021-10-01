package com.spring.service;

import java.sql.Date;
import java.util.List;


import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
import com.spring.dao.AssignDao;
import com.spring.model.AssignTrain;
import com.spring.model.Book;
import com.spring.model.Road;
import com.spring.model.Train;
@Service
public class AssignTrainService implements ICommonService<AssignTrain>{
	@Autowired
	AssignDao assignDao;
	@Override
	public AssignTrain save(HttpServletRequest request) {
		
		AssignTrain a = new AssignTrain();
		
		a.setTravel_code(request.getParameter("travel_code"));
		a.setTravel_name(request.getParameter("travel_name"));
		a.setTrain_code(request.getParameter("train_code"));
		a.setTrain_name(request.getParameter("train_name"));
		a.setRoad_code(request.getParameter("road_code"));
		a.setRoad_name(request.getParameter("road_name"));
		java.sql.Date date = Date.valueOf(request.getParameter("date"));
        a.setDate(date);
		a.setTime(request.getParameter("time"));	
		return assignDao.save(a);
	}

	@Override
	public AssignTrain edit(String id) {
		 return assignDao.getById(Integer.valueOf(id));
		 
	}

	@Override
	public AssignTrain update(HttpServletRequest request) {
		AssignTrain a = new AssignTrain();
		
		a.setTravel_code(request.getParameter("travel_code"));
		a.setTravel_name(request.getParameter("travel_name"));
		a.setTrain_code(request.getParameter("train_code"));
		a.setTrain_name(request.getParameter("train_name"));
		a.setRoad_code(request.getParameter("road_code"));
		a.setRoad_name(request.getParameter("road_name"));
		
		  java.sql.Date date = Date.valueOf(request.getParameter("date"));
		  a.setDate(date);
		 
        
		a.setTime(request.getParameter("time"));	
		a.setId(Integer.valueOf(request.getParameter("id")));
		return assignDao.update(a);
	}

	@Override
	public List<AssignTrain> getAll() {
		return assignDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	public List<Train> trainall() {
		return assignDao.trainall();
	}

	public AssignTrain edit(int pid) {
		return assignDao.getById(pid);
		
	}

	

	
	/*
	 * public List<Road> allRoad() {
	 * 
	 * return assignDao.allRoad(); }
	 */
}
