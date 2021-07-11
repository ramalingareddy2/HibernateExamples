package com.otmb.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;

@Data
public class Store implements Serializable{
	
	protected int storeNo;
	protected String storeName;
	protected String ownerName;
	protected String contactNo;
	protected String emailAddress;
	protected Set<Staff> staff;

}
