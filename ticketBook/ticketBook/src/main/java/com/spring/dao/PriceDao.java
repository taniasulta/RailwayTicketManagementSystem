package com.spring.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.common.ICommonDAO;
import com.spring.model.Price;
import com.spring.model.Seat;
import com.spring.model.Train;
@Repository(value = "priceDao")
@Transactional
public class PriceDao implements ICommonDAO<Price>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	@Override
	public Price save(Price p) {
		getSession().save(p);
    	getSession().flush();
        return p;
	}

	@Override
	public List<Price> getAll() {
		String sql = "from Price";
        List<Price> price = getSession().createQuery(sql).list();
        return price;
	}

	@Override
	public Price getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Price update(Price t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Price t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public List<Train> trainall() {
		String sql = "from Train";
        List<Train> train = getSession().createQuery(sql).list();
        return train;
	}

}
