package com.spring.dao;
import com.spring.model.AssignTrain;

import com.spring.model.Road;
import com.spring.model.Station;
import com.spring.model.Train;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.common.ICommonDAO;
@Repository(value = "assignDao")
@Transactional
public class AssignDao implements ICommonDAO<AssignTrain>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	@Override
	public AssignTrain save(AssignTrain a) {
		getSession().save(a);
    	getSession().flush();
        return a;
	}

	@Override
	public List<AssignTrain> getAll() {
		String sql = "from AssignTrain";
		List<AssignTrain> assignTrain = getSession().createQuery(sql).list();
		return assignTrain;
	}

	@Override
	public AssignTrain getById(int tid) {
		 String sql = "from AssignTrain where id = '" + tid + "'";
	        List<AssignTrain> assignTrainList = getSession().createQuery(sql).list();
	        return assignTrainList.get(0);
	}

	@Override
	public AssignTrain update(AssignTrain a) {
		getSession().update(a);
    	getSession().flush();
        return a;
	}

	@Override
	public int delete(AssignTrain t) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	 
	

	public List<Train> trainall() {
		String sql = "from Train";
        List<Train> train = getSession().createQuery(sql).list();
        return train;
	}
}
