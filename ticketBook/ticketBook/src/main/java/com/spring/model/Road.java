package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Road")
@Table(name="road")
public class Road {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String road_code;
	private String road_name;
	private String starting_station_name;
	private String starting_station_code;
	private String ending_station_name;	
	private String ending_station_code;
	public Road() {
	}
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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



	public String getStarting_station_name() {
		return starting_station_name;
	}



	public void setStarting_station_name(String starting_station_name) {
		this.starting_station_name = starting_station_name;
	}



	public String getStarting_station_code() {
		return starting_station_code;
	}


	public void setStarting_station_code(String starting_station_code) {
		this.starting_station_code = starting_station_code;
	}


	public String getEnding_station_name() {
		return ending_station_name;
	}


	public void setEnding_station_name(String ending_station_name) {
		this.ending_station_name = ending_station_name;
	}


	public String getEnding_station_code() {
		return ending_station_code;
	}


	public void setEnding_station_code(String ending_station_code) {
		this.ending_station_code = ending_station_code;
	}

	
}

	