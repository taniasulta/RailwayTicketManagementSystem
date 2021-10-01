package com.spring.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface ICommonService <T>{
	public T save(HttpServletRequest request);
	public T edit(String id);
	public T update(HttpServletRequest request);
	public List<T> getAll();
	public int delete(String id);

}
