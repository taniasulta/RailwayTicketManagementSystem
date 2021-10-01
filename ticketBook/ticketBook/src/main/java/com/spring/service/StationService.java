package com.spring.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.common.ICommonService;
import com.spring.dao.StationDao;

import com.spring.model.Station;
import com.spring.model.Train;
@Service(value="stationService")
public class StationService implements ICommonService<Station>{
	@Autowired
	StationDao stationDao;
	@Override
	public Station save(HttpServletRequest request) {
		String name = request.getParameter("name");
        Station s = new Station();
        s.setName(name);
        s.setCode(request.getParameter("code"));
        s.setLocation(request.getParameter("location"));
       
        return  stationDao.save(s);
	}

	@Override
	public Station edit(String id) {
		
		return stationDao.getById(Integer.valueOf(id));
	}

	@Override
	public Station update(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Station> getAll() {
		return stationDao.getAll();

		
	}

	@Override
	public int delete(String id) {
		 Station s= stationDao.getById(Integer.valueOf(id));
	        return stationDao.delete(s);
	}

}
