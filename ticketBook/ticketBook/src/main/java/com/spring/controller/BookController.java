package com.spring.controller;


import com.spring.model.AssignTrain;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Book;
import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.service.AssignTrainService;
import com.spring.service.BookService;
import com.spring.service.RoadService;
@RestController
@RequestMapping("book")
public class BookController implements ICommonController {
	@Autowired
	BookService bookService;
	@Autowired
	AssignTrainService assignTrainService;
	@Autowired
	RoadService roadService;
	@Override
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView create() {
		// TODO Auto-generated method stub
		return new ModelAndView("book/search");
	}
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView search(HttpServletRequest request) {
		System.out.print("Hello");
		
		
		List<AssignTrain> assignTrains = bookService.search(request);
		
		return new ModelAndView("book/show", "assignTrains", assignTrains);
	}
	
	
	@RequestMapping("/all")
	public ModelAndView stationAll(Model model) {
		List<AssignTrain> assignTrains = assignTrainService.getAll();
		
		List<Road> roads = roadService.getAll();
		model.addAttribute("assignTrains", assignTrains);
		model.addAttribute("roads", roads);
		return new ModelAndView("book/search");
		
		
	}
	
	public ModelAndView passengersDetails() {
		return new ModelAndView("book/search");
	}
	

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request)  {
		
		 Book b = bookService.save(request);
		 String total = request.getParameter("total_amount");
		 String pay = request.getParameter("pay_amount");
		 System.out.println(total+" "+pay+" "+total.equals(pay));
		 if(total.equals(pay)) {
			 return new ModelAndView("passenger/success", "b", b );
			}else {
				return new ModelAndView("passenger/bikash", "b", b );
			}
		
	}

	@Override
	public ModelAndView edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelAndView getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
