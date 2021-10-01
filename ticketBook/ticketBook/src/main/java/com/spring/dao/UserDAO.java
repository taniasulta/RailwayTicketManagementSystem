package com.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.AppUser;


@Repository("userDAO")
@Transactional
public class UserDAO {
		
		@Autowired
	    private EntityManager entityManager;
	    
	    private Session getSession() {
	        return entityManager.unwrap(Session.class);
	    }

		public AppUser register(AppUser u) {
			getSession().save(u);
			getSession().flush();
			return u;
		}

}
