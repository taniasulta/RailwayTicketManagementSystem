package com.spring.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Price;
import com.spring.model.Train;
import com.spring.service.PriceService;
@RestController
@RequestMapping("/price")
public class PriceController implements ICommonController{
	@Autowired
	PriceService priceService;
	@Override
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("price/add");
	}
	@RequestMapping("/all")
	public ModelAndView traniall() {
		List<Train> trains = priceService.trainall();
		return new ModelAndView("price/add", "trains", trains);
	}

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		Price price= priceService.save(request);
		return new ModelAndView("price/add");
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
	@RequestMapping("/show")
	public ModelAndView getAll() {
		List<Price> price = priceService.getAll();
        return new ModelAndView("price/show", "price", price);
	}

}
