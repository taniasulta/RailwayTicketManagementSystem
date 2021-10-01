package com.spring.service;
import com.spring.model.Book;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
@Service
public class ReportService implements ICommonService<Book>{
@Autowired
ReportService reportService;
	@Override
	public Book save(HttpServletRequest request) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
