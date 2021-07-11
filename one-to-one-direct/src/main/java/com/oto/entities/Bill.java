package com.oto.entities;

import java.util.Date;

import lombok.Data;

@Data
public class Bill {
	protected int billNo;
	protected String consumerName;
	protected Date billGeneratedDate;
	protected Date dueDate;
	protected double amount;
}
