package com.spring.controller;
import com.spring.model.Book;
import com.spring.model.Schedule;
import com.spring.model.Train;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.service.ScheduleService;



@RestController
@RequestMapping("schedule")
public class ScheduleController implements ICommonController {
	@Autowired
	ScheduleService scheduleService;
	@Override
	@RequestMapping(value="/add")
	public ModelAndView create() {
		
		return new ModelAndView("schedule/add");
	}
	@RequestMapping("/all")
	public ModelAndView traniall() {
		List<Train> trains = scheduleService.trainall();
		return new ModelAndView("schedule/add", "trains", trains);
	}

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request)  {
		Schedule sche = scheduleService.save(request);
		 return new ModelAndView("schedule/add");
	}
	

	@Override
	@RequestMapping(value="/edit")
	public ModelAndView edit(String id) {
		return new ModelAndView("schedule/edit");
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
		List<Schedule> schedule = scheduleService.getAll();

 
		return new ModelAndView("schedule/show", "schedules", schedule);
	}
	

}
