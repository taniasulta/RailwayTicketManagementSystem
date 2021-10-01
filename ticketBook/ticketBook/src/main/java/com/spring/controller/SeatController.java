package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.common.ICommonController;
import com.spring.model.Seat;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.service.SeatService;

@RestController
@RequestMapping("seat")
public class SeatController implements ICommonController{
	@Autowired
	SeatService seatService;
	@Override
	@RequestMapping("/add")
	public ModelAndView create() {
		return new ModelAndView("seat/add");
	}
	@RequestMapping("/all")
	public ModelAndView allTrain() {
		List<Train> trains = seatService.allTrain();
		return new ModelAndView("seat/add", "trains", trains);
	}

	@Override
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView save(HttpServletRequest request) {
		Seat seat = seatService.save(request);
		return new ModelAndView("seat/add");
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
		List<Seat> seats = seatService.getAll();
        return new ModelAndView("seat/show", "seats", seats);
	}

}
