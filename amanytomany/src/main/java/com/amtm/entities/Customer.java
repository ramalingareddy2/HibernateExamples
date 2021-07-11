package com.amtm.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="tbl_customer")
@Setter
@Getter
public class Customer implements Serializable{
	@Id
	@Column(name = "customer_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int coustomerNo;
	@Column(name = "customer_nm")
	protected String customerName;
	protected String gender;
	protected int age;
	@Column(name="mobile_no")
	protected String mobileNo;
	@Column(name = "email_addr")
	protected String emailAddress;
	
	@ManyToMany(mappedBy = "customers",cascade = CascadeType.PERSIST)
	protected Set<Loan> loans;

}
