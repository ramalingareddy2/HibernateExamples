package com.jpa.annotations.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_no")
	protected int customerNo;
	@Column(name = "full_nm")
	protected String fullName;
	@Column(name = "email_addr")
	protected String emailAddress;
	@Column(name = "mobile_no")
	protected String mobileNo;
	protected Date dob;
	protected String gender;
	@Column(name = "driving_license_no")
	protected String drivingLicenseNo;

}
