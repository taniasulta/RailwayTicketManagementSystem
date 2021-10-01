package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.spring.common.ICommonDAO;
import com.spring.model.Seat;
import com.spring.model.Station;
import com.spring.model.Train;

@Repository(value = "seatDao")
@Transactional
public class SeatDao implements ICommonDAO<Seat>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	@Override
	public Seat save(Seat s) {
		getSession().save(s);
    	getSession().flush();
        return s;
	}

	@Override
	public List<Seat> getAll() {
		String sql = "from Seat";
        List<Seat> seats = getSession().createQuery(sql).list();
        return seats;
	}

	@Override
	public Seat getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Seat update(Seat t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Seat t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Train> allTrain() {
		String sql = "from Train";
        List<Train> train = getSession().createQuery(sql).list();
        return train;
	}
	
	
}
