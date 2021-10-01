package com.spring.controller;

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
import com.spring.model.AssignTrain;
import com.spring.model.Book;

import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.service.AssignTrainService;
import com.spring.service.RoadService;
import com.spring.service.TrainService;

@RestController
@RequestMapping("assign")
public class AssignTrainController implements ICommonController {
	@Autowired
	AssignTrainService assignTrainService;
	@Autowired
	TrainService trainService;
	@Autowired
	RoadService roadService;
	
	@Override
	@RequestMapping("/add")
	public ModelAndView create() {
		return new ModelAndView("assignTrain/add");
	}

	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public ModelAndView traniall(Model model) {
		List<Train> trains = trainService.getAll();
		List<Road> roads = roadService.getAll();
		model.addAttribute("trains", trains);
		model.addAttribute("roads", roads);
		return new ModelAndView("assignTrain/add");

		
	}

	 
	 
	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		AssignTrain assignTrain = assignTrainService.save(request);
		 return new ModelAndView("assignTrain/add");
	}

	@Override
	@RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
	public ModelAndView edit(@PathVariable String id) {
		int pid = Integer.valueOf(id);
		AssignTrain at = assignTrainService.edit(pid);
		return new ModelAndView("assign/edit", "at", at);
	}

	

	@Override
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest request) {
		AssignTrain assignTrain = assignTrainService.update(request);
		List<AssignTrain> assignTrains = assignTrainService.getAll();
		return new ModelAndView("assignTrain/show", "assignTrains", assignTrains );
	}

	@Override
	public ModelAndView delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value="/show")
	public ModelAndView getAll() {
		List<AssignTrain> assignTrains = assignTrainService.getAll();
		return new ModelAndView("assignTrain/show", "assignTrains", assignTrains );
	}

}
