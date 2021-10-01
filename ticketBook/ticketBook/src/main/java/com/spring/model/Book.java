package com.spring.model;





import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	@Id
	
	private int id;
	private String travel_name;
	private String travel_code;
	private String train_name;
	private String train_code;
	private String road_name;
	private String road_code;
	private String date;
	private String time;
	private String seat_class;
	private double seat_price;
	private int no_of_seats;
	private String first_name;
	private String last_name;
	private String mobile_number;
	private String email;
	private String address;
	private String passenger_id;
	private String bkash_number;
	private String total_amount;
	private String vat;
	private String issue_date;
	private String pay_amount;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Book(int id, String travel_name, String travel_code, String train_name, String train_code, String road_name,
			String road_code, String date, String time, String seat_class, double seat_price, int no_of_seats,
			String first_name, String last_name, String mobile_number, String email, String address,
			String passenger_id, String bkash_number, String total_amount, String vat, String issue_date) {
		super();
		this.id = id;
		this.travel_name = travel_name;
		this.travel_code = travel_code;
		this.train_name = train_name;
		this.train_code = train_code;
		this.road_name = road_name;
		this.road_code = road_code;
		this.date = date;
		this.time = time;
		this.seat_class = seat_class;
		this.seat_price = seat_price;
		this.no_of_seats = no_of_seats;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
		this.email = email;
		this.address = address;
		this.passenger_id = passenger_id;
		this.bkash_number = bkash_number;
		this.total_amount = total_amount;
		this.vat = vat;
		this.issue_date = issue_date;
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

	public String getVat() {
		return vat;
	}

	public void setVat(String vat) {
		this.vat = vat;
	}

	public String getTravel_name() {
		return travel_name;
	}


	public void setTravel_name(String travel_name) {
		this.travel_name = travel_name;
	}


	public String getTravel_code() {
		return travel_code;
	}




	public void setTravel_code(String travel_code) {
		this.travel_code = travel_code;
	}




	public String getPay_amount() {
		return pay_amount;
	}


	public void setPay_amount(String pay_amount) {
		this.pay_amount = pay_amount;
	}


	public String getTrain_code() {
		return train_code;
	}




	public void setTrain_code(String train_code) {
		this.train_code = train_code;
	}




	public String getRoad_name() {
		return road_name;
	}




	public void setRoad_name(String road_name) {
		this.road_name = road_name;
	}




	public String getRoad_code() {
		return road_code;
	}




	public void setRoad_code(String road_code) {
		this.road_code = road_code;
	}




	

	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	public String getSeat_class() {
		return seat_class;
	}

	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public double getSeat_price() {
		return seat_price;
	}


	public void setSeat_price(double seat_price) {
		this.seat_price = seat_price;
	}


	public int getNo_of_seats() {
		return no_of_seats;
	}


	public void setNo_of_seats(int no_of_seats) {
		this.no_of_seats = no_of_seats;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}





	public String getBkash_number() {
		return bkash_number;
	}





	public void setBkash_number(String bkash_number) {
		this.bkash_number = bkash_number;
	}





	public String getTotal_amount() {
		return total_amount;
	}





	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}





	public String getMobile_number() {
		return mobile_number;
	}


	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(String passenger_id) {
		this.passenger_id = passenger_id;
	}

	public String getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}


}
