package com.amtm.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="tbl_loan")
@Setter
@Getter
public class Loan implements Serializable{
	@Id
	@Column(name = "loan_no")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int loanNo;
	@Column(name="loan_type")
	protected String loanType;
	@Column(name="principle_amt")
	protected double principleAmount;
	@Column(name="intrest_rate")
	protected double intrestRate;
	protected int tenure;
	@ManyToMany
	@JoinTable(name = "tbl_loan_customers",joinColumns = {@JoinColumn(name="loan_no")},inverseJoinColumns = {@JoinColumn(name="customer_no")})
	protected Set<Customer> customers;

}
