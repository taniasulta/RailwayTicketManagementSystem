package com.spring.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="AssignTrain")
@Table(name="assignTrain")
public class AssignTrain {
	
	@Id
	private int id;
	private String travel_code;
	private String travel_name;
	private String train_code;
	private String train_name;
	private String road_code;
	private String road_name;
	private Date date;
	private String time;
	public AssignTrain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AssignTrain(int id, String travel_code, String travel_name, String train_code, String train_name,
			String road_code, String road_name, Date date, String time) {
		super();
		this.id = id;
		this.travel_code = travel_code;
		this.travel_name = travel_name;
		this.train_code = train_code;
		this.train_name = train_name;
		this.road_code = road_code;
		this.road_name = road_name;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTravel_code() {
		return travel_code;
	}

	public void setTravel_code(String travel_code) {
		this.travel_code = travel_code;
	}

	public String getTravel_name() {
		return travel_name;
	}

	public void setTravel_name(String travel_name) {
		this.travel_name = travel_name;
	}

	public String getTrain_code() {
		return train_code;
	}

	public void setTrain_code(String train_code) {
		this.train_code = train_code;
	}

	public String getTrain_name() {
		return train_name;
	}

	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}

	public String getRoad_code() {
		return road_code;
	}

	public void setRoad_code(String road_code) {
		this.road_code = road_code;
	}

	public String getRoad_name() {
		return road_name;
	}

	public void setRoad_name(String road_name) {
		this.road_name = road_name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	
}
