package com.otmb.entities;

import java.io.Serializable;

import lombok.Data;
@Data
public class Staff implements Serializable{
	
	protected int staffNo;
	protected String firstName;
	protected String lastName;
	protected String gender;
	protected int age;
	protected String mobileNo;
	protected Store store;

}
