package com.mtml.entities;

import java.io.Serializable;

import lombok.Data;

@Data
public class Passenger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int passengerNo;
	protected String fullName;
	protected int age;
	protected String gender;
	protected String contactNo;
	protected String emailAddress;
	

}
