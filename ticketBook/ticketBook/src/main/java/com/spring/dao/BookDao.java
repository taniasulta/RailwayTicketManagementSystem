package com.spring.dao;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.common.ICommonDAO;
import com.spring.model.AssignTrain;
import com.spring.model.Book;
import com.spring.model.Station;
@Repository(value = "bookDao")
@Transactional
public class BookDao implements ICommonDAO<Book>{
	@Autowired
    private EntityManager entityManager;
    
    private Session getSession() {
        return entityManager.unwrap(Session.class);
    }

	@Override
	public Book save(Book b) {
		getSession().save(b);
    	getSession().flush();
        return b;
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

	public List<Station> stationAll() {
		String sql = "from Station";
        List<Station> station = getSession().createQuery(sql).list();
        return station;
	}

	public List<AssignTrain> search(HttpServletRequest request) {
		String road_code = request.getParameter("road_code");
		System.out.println(".............................. " + road_code);
	    //java.sql.Date date = 
	   // String strDate = formatter.format(date);  


		 String sql = "from AssignTrain where road_code = '" + road_code + "' and date='"+ java.sql.Date.valueOf(request.getParameter("date"))+"'";
	        List<AssignTrain> assignTrainList = getSession().createQuery(sql).list();
	        return assignTrainList;
		//return null;
	}
	
}
