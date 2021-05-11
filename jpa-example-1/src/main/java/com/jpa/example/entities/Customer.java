package com.jpa.example.entities;

import java.sql.Date;

import lombok.Data;

@Data
public class Customer {
	
	protected int customerNo;
	protected String fullName;
	protected String emailAddress;
	protected String mobileNo;
	protected Date dob;
	protected String gender;
	protected String drivingLicenseNo;

}
