package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Train")
@Table(name = "train")
public class Train {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; 
	
	@Column(name = "train_name")
	private String  train_name;  
	@Column(name = "train_code")
	private String train_code ;
	@Column(name = "train_type")
	private String train_type;
	@Column(name = "seat_number")
	private int seat_number;
	@Column(name = "shovon")
	private int shovon;
	@Column(name = "ac_seat")
	private int ac_seat;
	@Column(name = "ac_birth")
	private int ac_birth;
	
	public Train() {
		
	}
	
	
	

	public Train(int id, String train_name, String train_code, String train_type, int seat_number, int shovon,
			int ac_seat, int ac_birth) {
		super();
		this.id = id;
		this.train_name = train_name;
		this.train_code = train_code;
		this.train_type = train_type;
		this.seat_number = seat_number;
		this.shovon = shovon;
		this.ac_seat = ac_seat;
		this.ac_birth = ac_birth;
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




	public String getTrain_code() {
		return train_code;
	}




	public void setTrain_code(String train_code) {
		this.train_code = train_code;
	}




	public String getTrain_type() {
		return train_type;
	}




	public void setTrain_type(String train_type) {
		this.train_type = train_type;
	}




	public int getSeat_number() {
		return seat_number;
	}




	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}




	public int getShovon() {
		return shovon;
	}


	public void setShovon(int shovon) {
		this.shovon = shovon;
	}


	public int getAc_seat() {
		return ac_seat;
	}


	public void setAc_seat(int ac_seat) {
		this.ac_seat = ac_seat;
	}


	public int getAc_birth() {
		return ac_birth;
	}


	public void setAc_birth(int ac_birth) {
		this.ac_birth = ac_birth;
	}
	

	
}
	
	

