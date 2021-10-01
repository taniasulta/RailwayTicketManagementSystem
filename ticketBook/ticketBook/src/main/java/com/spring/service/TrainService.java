package com.spring.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
import com.spring.dao.TrainDao;
import com.spring.model.Road;
import com.spring.model.Train;
@Service(value="trainService")
public class TrainService implements ICommonService<Train> {
	@Autowired
	TrainDao trainDao;
	
	@Override
	public Train save(HttpServletRequest request) {
		System.out.println("world");
		
        Train t = new Train();
        t.setTrain_name(request.getParameter("train_name"));
        t.setTrain_code(request.getParameter("train_code"));
        t.setTrain_type(request.getParameter("train_type"));
        t.setSeat_number(Integer.valueOf(request.getParameter("seat_number")));
        t.setShovon(Integer.valueOf(request.getParameter("shovon")));
        
        t.setAc_seat(Integer.valueOf(request.getParameter("ac_seat")));
        
        t.setAc_birth(Integer.valueOf(request.getParameter("ac_birth")));
        
        
        return  trainDao.save(t);
        }

	@Override
	public Train edit(String tid) {
		Train t= new Train();
		System.out.println(t.getId());
		return trainDao.getById(Integer.valueOf(tid));
	}

	@Override
	public Train update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Train> getAll() {
		return trainDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Road> allRoad() {
		// TODO Auto-generated method stub
		return trainDao.allRoad();
	}

	
}
