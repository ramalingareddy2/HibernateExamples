package com.otmm.entites;

import java.util.Date;
import java.util.Map;

import lombok.Data;
@Data
public class Contractor {
	protected int contractorNo;
	protected String orgnizationName;
	protected Date encorporatedDate;
	protected String emailAddress;
	protected String contactNo;
	protected String licenseNo;
	Map<String, WorkOrder> workOrders;
	

}
