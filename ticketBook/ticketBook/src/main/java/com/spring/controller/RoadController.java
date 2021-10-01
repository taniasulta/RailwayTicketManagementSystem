package com.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.service.RoadService;
@RestController
@RequestMapping("road")
public class RoadController implements ICommonController{
	@Autowired
	RoadService roadService;
	
	@Override
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView ("road/add");
	}

	@Override
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request)  {
		System.out.println(request.getParameter("starting_station_name"));
		Road train = roadService.save(request);
		 return new ModelAndView("road/add");	
	}
	@Override
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public ModelAndView edit(String id) {
		return new ModelAndView("road/edit");
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
	@RequestMapping(value="/show", method=RequestMethod.GET)
	public ModelAndView getAll() {
		List<Road> roads = roadService.getAll();
		return new ModelAndView("road/show", "roads", roads ); 
	}
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ModelAndView stationAll() {
		List<Station> stations = roadService.stationAll();
		return new ModelAndView("road/add", "stations", stations);
		
	}
	

}
