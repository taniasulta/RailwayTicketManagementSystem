package com.spring.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.common.ICommonService;
import com.spring.dao.RoadDao;
@Service(value="roadService")
public class RoadService implements ICommonService<Road> {
	@Autowired
	RoadDao roadDao;
	@Override
	public Road save(HttpServletRequest request) {

        Road r = new Road();
        r.setRoad_name(request.getParameter("road_name"));
        r.setRoad_code(request.getParameter("road_code"));
        
        r.setStarting_station_code(request.getParameter("starting_station_code"));
        r.setStarting_station_name(request.getParameter("starting_station_name"));
        r.setEnding_station_name(request.getParameter("ending_station_name"));
        r.setEnding_station_code(request.getParameter("ending_station_code"));
        System.out.println("Bangla");
        return  roadDao.save(r);
	}

	@Override
	public Road edit(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Road update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Road> getAll() {
		return roadDao.getAll();
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Station> stationAll() {
		return roadDao.stationAll();
	}


}
