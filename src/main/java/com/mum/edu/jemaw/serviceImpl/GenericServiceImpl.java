package com.mum.edu.jemaw.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mum.edu.jemaw.dao.GenericDAO;
import com.mum.edu.jemaw.service.GenericService;


public abstract class GenericServiceImpl<T> implements GenericService<T> {
	protected abstract GenericDAO getDAO();
	@Transactional
	public T findOne(Long id) {
		return (T) getDAO().findOne(id);
	}
	@Transactional
	public List<T> findAll() {
		return getDAO().findAll();
	}

	@Transactional
	public T save(T entity) {
		return (T) getDAO().save(entity);
	}

	@Transactional
	public T update(T entity) {
		return (T) getDAO().update(entity);
	}

	@Transactional
	public void delete(T entity) {
		getDAO().delete(entity);
	}

	@Transactional
	public void deleteById(long id) {
		getDAO().deleteById(id);
	}

	public Integer countAll() {
		return getDAO().countAll();
	}
}
