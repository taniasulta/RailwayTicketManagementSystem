package com.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.common.ICommonService;
import com.spring.dao.SeatDao;
import com.spring.model.Book;
import com.spring.model.Seat;
import com.spring.model.Train;
@Service(value="seatService")
public class SeatService implements ICommonService<Seat>{
	@Autowired
	SeatDao seatDao;
	@Override
	
	public Seat save(HttpServletRequest request) {
		String name=request.getParameter("train_name");
		Seat s = new Seat();
		
		return seatDao.save(s);
	}

	@Override
	public Seat edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seat update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seat> getAll() {
		// TODO Auto-generated method stub
		return seatDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Train> allTrain() {
		return seatDao.allTrain();
	}
	
	

}
