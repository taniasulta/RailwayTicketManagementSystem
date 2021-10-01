package com.spring.controller;
import com.spring.model.AssignTrain;
import com.spring.model.Book;
import com.spring.model.Passenger;
import com.spring.model.Price;
import com.spring.model.Station;
import com.spring.model.Train;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Book;
import com.spring.service.PassengerService;
import com.spring.service.PriceService;
@RestController
@RequestMapping("passenger")
public class PassengerController implements ICommonController{
	@Autowired
	PassengerService passengerService;
	@Autowired
	PriceService priceService;
	@Override
	@RequestMapping(value="/add")
	public ModelAndView create() {
		return new ModelAndView("passenger/add");
	}
	@RequestMapping("/payment")
	public ModelAndView priceList() {
		List<Price> price = priceService.getAll();
		return new ModelAndView("passenger/payment", "price", price);
	}

	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		
		Book passenger= passengerService.save(request);
		
		return new ModelAndView("passenger/add");
	}
	@RequestMapping(value="/pay")
	public ModelAndView payment() {
		return new ModelAndView("passenger/payment");
	}
	@RequestMapping(value="/bikash" , method=RequestMethod.POST)
	public ModelAndView bikash(HttpServletRequest request, ModelMap map) {
		System.out.println("bikash hit");
		System.out.println(request.getParameter("address"));
		Book b = new Book();
		
		b.setTravel_code(request.getParameter("travel_code"));
		b.setTravel_name(request.getParameter("travel_name"));
		b.setTrain_code(request.getParameter("train_code"));
		b.setTrain_name(request.getParameter("train_name"));
		b.setRoad_code(request.getParameter("road_code"));
		b.setRoad_name(request.getParameter("road_name"));
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
		b.setNo_of_seats(Integer.valueOf(request.getParameter("no_of_seats")));
		//map.addAttribute("totalSeat", Integer.valueOf(request.getParameter("no_of_seats")))	;
		return new ModelAndView("passenger/bikash", "b", b);
	}
	@RequestMapping(value="/otp")
	public ModelAndView otp() {
		return new ModelAndView("passenger/otp");
	}
	
	
	@RequestMapping(value="/success")
	public ModelAndView success() {
		return new ModelAndView("passenger/success");
	}
	
	@Override
	@RequestMapping(value="/search/{id}", method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id) {
		int pid = Integer.valueOf(id);
		Book at = passengerService.editByid(pid);
		return new ModelAndView("assign/edit", "at", at);
	}


	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id, ModelMap map) {
		int pid = Integer.valueOf(id);
		AssignTrain at = passengerService.edit(pid);
		List<Price> price = priceService.getAll();
		map.addAttribute("at", at);
		map.addAttribute("price", price);
		return new ModelAndView("passenger/add");
	}

	@Override
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable  String id) {
		int delete=passengerService.delete(id);
		List<Book> book= passengerService.getAll();
		return new ModelAndView("passenger/allbook","book", book);
	}

	@Override	
		@RequestMapping(value="/allbook")
	public ModelAndView getAll() {
		List<Book> books = passengerService.getAll();
		return new ModelAndView("passenger/allbook", "books", books );
	}
	@RequestMapping(value = "/showTicket", method = RequestMethod.GET)
	public ModelAndView viewSal(HttpServletRequest request) {
		 List<Book> books = passengerService.getAll(); 
			
			return new ModelAndView("passenger/allbook", "books", books);
		}
	@RequestMapping(value="/allcoach",  method = RequestMethod.POST)
	public ModelAndView ticketBook(HttpServletRequest request) {
		System.out.print(request.getParameter("seat_class"));
		List<Book> books = passengerService.getClassName(request);
		return new ModelAndView("passenger/allbook", "books", books );
	}
	

	


	}

