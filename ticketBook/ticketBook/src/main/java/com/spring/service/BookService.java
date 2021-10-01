package com.spring.service;





import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
import com.spring.dao.BookDao;
import com.spring.model.AssignTrain;
import com.spring.model.Book;
import com.spring.model.Station;
@Service
public class BookService implements ICommonService<Book>{
	@Autowired
	BookDao bookDao;
	@Override
	public Book save(HttpServletRequest request) {
		
		Book b = new Book();
		
		b.setTravel_code(request.getParameter("travel_code"));
		b.setTravel_name(request.getParameter("travel_name"));
		b.setTrain_code(request.getParameter("train_code"));
		b.setTrain_name(request.getParameter("train_name"));
		b.setRoad_code(request.getParameter("road_code"));
		b.setRoad_name(request.getParameter("road_name"));
		/*
		 * java.sql.Date date = Date.valueOf(request.getParameter("date"));
		 * b.setDate(date);
		 */
		b.setDate(request.getParameter("date"));
		b.setTime(request.getParameter("time"));
		b.setFirst_name(request.getParameter("first_name"));
		b.setLast_name(request.getParameter("last_name"));
		b.setMobile_number(request.getParameter("mobile_number"));
		b.setEmail(request.getParameter("email"));
		b.setAddress(request.getParameter("address"));
		b.setPassenger_id(request.getParameter("passenger_id"));
		b.setSeat_class(request.getParameter("seat_class"));
		b.setSeat_price(Double.valueOf(request.getParameter("seat_price")));
		b.setBkash_number(request.getParameter("bkash_number"));
		b.setTotal_amount(request.getParameter("total_amount"));
		b.setNo_of_seats(Integer.valueOf(request.getParameter("no_of_seats")));
		b.setVat(request.getParameter("vat"));
		b.setIssue_date(request.getParameter("issue_date"));
		b.setPay_amount(request.getParameter("pay_amount"));
		return bookDao.save(b);
	}

	@Override
	public Book edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(HttpServletRequest request) {
		return null;
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Station> stationAll() {
		return bookDao.stationAll();
	}

	public List<AssignTrain> search(HttpServletRequest request) {
		
		return bookDao.search(request);
	}

	}

	

