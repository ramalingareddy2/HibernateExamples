package com.otmm.entites;

import java.util.Date;

import lombok.Data;
@Data 
public class WorkOrder {
	private int workOrderNo;
	private String description;
	private String status;
	private Date estimatedStartDate;
	protected int duration;
	protected double budget;
	private String title;

}
