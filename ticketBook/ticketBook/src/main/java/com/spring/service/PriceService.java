package com.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.dao.PriceDao;
import com.spring.common.ICommonService;
import com.spring.model.Price;
import com.spring.model.Train;
@Service
public class PriceService implements ICommonService<Price>{
	@Autowired
	PriceDao priceDao; 
	@Override
	public Price save(HttpServletRequest request) {
		
		Price p=new Price();
		p.setCode(request.getParameter("code"));;
		p.setSeat_name(request.getParameter("seat_name"));
		p.setSeat_price(Double.valueOf(request.getParameter("seat_price")));
		System.out.println(p.getSeat_name());
		return priceDao.save(p);
	}

	@Override
	public Price edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Price update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Price> getAll() {
		// TODO Auto-generated method stub
		return priceDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Train> trainall() {
		return priceDao.trainall();
	}
	

}
