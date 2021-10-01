package com.spring.dao;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.common.ICommonDAO;
import com.spring.model.Book;
@Repository(value = "reportDao")
@Transactional
public class ReportDao implements ICommonDAO<Book>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	@Override
	public Book save(Book t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getById(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(Book t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Book t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
