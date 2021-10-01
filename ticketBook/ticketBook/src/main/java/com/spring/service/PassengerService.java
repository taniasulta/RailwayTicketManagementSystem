package com.spring.service;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
import com.spring.dao.PassengerDao;
import com.spring.model.AssignTrain;
import com.spring.model.Book;
import com.spring.model.Station;
@Service
public class PassengerService implements ICommonService<Book> {
	@Autowired
	PassengerDao passengerDao;
	@Override
	
	public Book save(HttpServletRequest request) {
		
		
		return null;
	}

	@Override
	public Book edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAll() {
		return passengerDao.getAll();
	}

	@Override
	public int delete(String id) {
		Book b= passengerDao.getById(Integer.valueOf(id));
        return passengerDao.delete(b);
	}

	public AssignTrain edit(int pid) {
		return passengerDao.edit(pid);
	}

	public Book editByid(int pid) {
		return passengerDao.editByid(pid);
	}

	public List<Book> getClassName(HttpServletRequest request) {
		List<Book> book = passengerDao.getClassName(request);
		return book;
	}
	

}
