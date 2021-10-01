package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.common.ICommonDAO;
import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;

@Repository(value = "roadDao")
@Transactional
public class RoadDao implements ICommonDAO<Road> {
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	@Override
	public Road save(Road r) {
		getSession().save(r);
    	getSession().flush();
        return r;
	}

	@Override
	public List<Road> getAll() {
		String sql = "from Road";
		List<Road> roads = getSession().createQuery(sql).list();
		return roads;
	}

	@Override
	public Road getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Road update(Road t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Road t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Station> stationAll() {
		String sql = "from Station";
		List<Station> station = getSession().createQuery(sql).list();
		return station;
	}

	/*
	 * public List<Station> stationCode() { String sql = "from Station";
	 * List<Station> station = getSession().createQuery(sql).list(); return station;
	 * }
	 */

}
