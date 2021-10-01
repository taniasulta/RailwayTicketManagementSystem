package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="price")
public class Price {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String seat_name;
	private double seat_price;
	public Price() {
		
	}
	public Price(int id, String train_name, String seat_name, double seat_price) {
		super();
		this.id = id;
		this.code=code;
		this.seat_name = seat_name;
		this.seat_price = seat_price;
	}
	public int getId() {
		return id;
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
	public String getSeat_name() {
		return seat_name;
	}
	public void setSeat_name(String seat_name) {
		this.seat_name = seat_name;
	}
	public double getSeat_price() {
		return seat_price;
	}
	public void setSeat_price(double seat_price) {
		this.seat_price = seat_price;
	}
	

}
