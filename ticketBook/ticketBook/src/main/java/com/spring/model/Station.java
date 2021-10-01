package com.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name="Station")
@Table(name="station")
public class Station {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	
	public Station() {
		
	}
	public int getId() {
		return id;
	}
	
	public Station(int id, String code, String name, String location) {
		
		this.id = id;
		this.code = code;
		this.name = name;
		this.location = location;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
