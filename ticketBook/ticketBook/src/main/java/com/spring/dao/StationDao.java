package com.spring.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.common.ICommonDAO;

import com.spring.model.Station;
@Repository(value = "stationDao")
@Transactional
public class StationDao implements ICommonDAO<Station>{
	@Autowired
	    private EntityManager entityManager;
	    
	    private Session getSession() {
	        return entityManager.unwrap(Session.class);
	    }
	@Override
	public Station save(Station s) {
		getSession().save(s);
    	getSession().flush();
        return s;
	}

	@Override
	public List<Station> getAll() {
		System.out.println("bangladesh");
		String sql = "from Station"; 
        List<Station> stations = getSession().createQuery(sql).list();
        return stations;
        
	}

	@Override
	public Station getById(int id) {
		String sql = "from station where id = '" + id + "'";
        List<Station> stlist = getSession().createQuery(sql).list();
        return stlist.get(0);
	}

	@Override
	public Station update(Station t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Station s) {
		String sql = "delete Station where id = '"+s.getId()+"'";
        int delete = getSession().createQuery(sql).executeUpdate();
        return delete;
	}

}
