package com.spring.dao;
import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Schedule;
import com.spring.model.Station;
import com.spring.model.Train;
import com.spring.common.ICommonDAO;
@Repository(value = "scheduleDao")
@Transactional
public class ScheduleDao implements ICommonDAO<Schedule>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

	@Override
	public Schedule save(Schedule sc) {
		getSession().save(sc);
    	getSession().flush();
        return sc;
	}

	@Override
	public List<Schedule> getAll() {
		String sql = "from Schedule"; 
        List<Schedule> schedules = getSession().createQuery(sql).list();
        return schedules;
	}

	@Override
	public Schedule getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Schedule update(Schedule t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Schedule t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Train> trainall() {
		String sql = "from Train";
        List<Train> train = getSession().createQuery(sql).list();
        return train;
	}

	
}
