package com.mum.edu.jemaw.daoImpl;


import org.springframework.stereotype.Repository;

import com.mum.edu.jemaw.dao.PersonDAO;
import com.mum.edu.jemaw.model.Person;

	
	@Repository("personDAO")
	public class PersonDAOImpl extends GenericDAOImpl<Person> implements
		PersonDAO {
		public PersonDAOImpl() {
			setClazz(Person.class);
		}

		
	}



