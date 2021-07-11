package com.otms.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;

@Data
public class Product implements Serializable {

	protected int productNo;
	protected String productName;
	protected String productDescription;
	protected double price;
	protected Set<Review> reviews;

}
