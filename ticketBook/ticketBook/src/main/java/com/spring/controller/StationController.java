package com.spring.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;

import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.service.StationService;


@RestController
@RequestMapping("station")

public class StationController implements ICommonController{
	@Autowired
	StationService stationService;
	@Override
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView create() {
		return new ModelAndView("station/addStation");
	}

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		System.out.println("station");
		Station station = stationService.save(request);
		System.out.println("station");
		 return new ModelAndView("station/addStation");
	}

	@Override
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView edit(String id) {
		 Station s = stationService.edit((id)); 
		
			return new ModelAndView("station/edit", "s", s); 
	}

	@Override
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView delete(@PathVariable String id) {
		int delete=stationService.delete(id);
		List<Station> stations= stationService.getAll();
		return new ModelAndView("station/show","stations", stations);
	}

	@Override
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public ModelAndView getAll() {
		List<Station> stations= stationService.getAll();
		return new ModelAndView("station/show", "stations", stations);
	}
	
	
	

}
