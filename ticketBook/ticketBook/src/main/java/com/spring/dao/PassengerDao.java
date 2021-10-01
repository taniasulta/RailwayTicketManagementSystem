package com.spring.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.spring.common.ICommonDAO;
import com.spring.model.AssignTrain;
import com.spring.model.Book;
@Repository(value = "passengerDao")
@Transactional
public class PassengerDao implements ICommonDAO<Book>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }
	@Override
	public Book save(Book p) {
		getSession().save(p);
    	getSession().flush();
        return p;
	}

	@Override
	public List<Book> getAll() {
		String sql = "from Book";
		List<Book> book = getSession().createQuery(sql).list();
		return book;
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
	public int delete(Book b) {
		String sql = "delete Book where id = '"+b.getId()+"'";
        int delete = getSession().createQuery(sql).executeUpdate();
        return delete;
	}
	public AssignTrain edit(int pid) {
		String sql = "from AssignTrain where id = '" + pid + "'";
        List<AssignTrain> assignTrainList = getSession().createQuery(sql).list();
        return assignTrainList.get(0);
	}
	public Book editByid(int pid) {
		String sql = "from Book where id = '" + pid + "'";
        List<Book> book = getSession().createQuery(sql).list();
        return book.get(0);
	}
	public List<Book> getClassName(HttpServletRequest request) {
		
			String seat = request.getParameter("seat_class");
			
			Query query = getSession().createQuery("FROM Book where class = '"+seat+"'");
			List<Book> books =((org.hibernate.query.Query) query).list();
			return books;
		}

	}


