package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="schedule")
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String train_name;
	private String road_name;
	private String arrival_time;
	private String departer_time;
	private String return_road;
	private String return_departur;
	private String return_arrival;
	
	
	
	public Schedule() {
		
		// TODO Auto-generated constructor stub
	}

	public Schedule(int id, String train_name, String road_name, String arrival_time, String departer_time,
			String return_road, String return_departur, String return_arrival) {
		
		this.id = id;
		this.train_name = train_name;
		this.road_name = road_name;
		this.arrival_time = arrival_time;
		this.departer_time = departer_time;
		this.return_road = return_road;
		this.return_departur = return_departur;
		this.return_arrival = return_arrival;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTrain_name() {
		return train_name;
	}


	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}


	public String getRoad_name() {
		return road_name;
	}


	public void setRoad_name(String road_name) {
		this.road_name = road_name;
	}


	public String getArrival_time() {
		return arrival_time;
	}


	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}


	public String getDeparter_time() {
		return departer_time;
	}


	public void setDeparter_time(String departer_time) {
		this.departer_time = departer_time;
	}

	public String getReturn_road() {
		return return_road;
	}

	public void setReturn_road(String return_road) {
		this.return_road = return_road;
	}

	public String getReturn_departur() {
		return return_departur;
	}

	public void setReturn_departur(String return_departur) {
		this.return_departur = return_departur;
	}

	public String getReturn_arrival() {
		return return_arrival;
	}

	public void setReturn_arrival(String return_arrival) {
		this.return_arrival = return_arrival;
	}
	
	
	
}
