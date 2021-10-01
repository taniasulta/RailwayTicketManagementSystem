package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.service.TrainService;

@RestController
@RequestMapping("train")
public class TrainController implements ICommonController {
	@Autowired
	TrainService trainService;
	
	@Override
	@RequestMapping(value="/add",  method = RequestMethod.GET)
	public ModelAndView create() {
		System.out.println("hello11");
		return new ModelAndView("train/AddTrain");
	}
	@RequestMapping("/all")
	public ModelAndView allRoad() {
		List<Road> roads = trainService.allRoad();
		return new ModelAndView("train/AddTrain", "roads", roads);
		
	}
	@Override
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		System.out.println(request.getParameter("seat"));
		 Train train = trainService.save(request);
		 return new ModelAndView("train/AddTrain");
		
	}
	@Override
	@RequestMapping(value="/edit/{id}", method= RequestMethod.GET)
	public ModelAndView edit(String id) {
		Train t = trainService.edit(id);
		return new ModelAndView("train/editTrain", "t", t);
	}
	@Override
	public ModelAndView update(HttpServletRequest request) {
		Train train=trainService.update(request);
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
		System.out.println("HIT");
		List<Train> trains = trainService.getAll();
        return new ModelAndView("train/TrainTable", "trains", trains);
		 
	}
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView add() {
		return new ModelAndView("seat/add");
	}

}
