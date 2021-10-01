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

@Repository(value = "trainDao")
@Transactional
public class TrainDao implements ICommonDAO<Train>{
	 @Autowired
	    private EntityManager entityManager;
	    
	    private Session getSession() {
	        return entityManager.unwrap(Session.class);
	    }


	    

	@Override
	public Train save(Train t) {
		getSession().save(t);
    	getSession().flush();
        return t;
	}

	@Override
	
	public List<Train> getAll() {
		String sql = "from Train";
        List<Train> trains = getSession().createQuery(sql).list();
        return trains;
//		 return sessionFactory.getCurrentSession().createQuery("from train").list();
	}

	@Override
	public Train getById(int tid) {
		String sql = "from Train where id = '" + tid + "'";
        List<Train> trnList = getSession().createQuery(sql).list();
        return trnList.get(0);
	}

	@Override
	public Train update(Train t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Train t) {
		// TODO Auto-generated method stub
		return 0;
	}




	public List<Road> allRoad() {
		String sql = "from Road";
        List<Road> road = getSession().createQuery(sql).list();
        return road;
	}

}
