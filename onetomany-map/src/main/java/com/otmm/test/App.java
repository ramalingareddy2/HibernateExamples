package com.otmm.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.otmm.dao.ContractorDao;
import com.otmm.entites.Contractor;
import com.otmm.entites.WorkOrder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ContractorDao contractorDao=new ContractorDao();
    	
    	WorkOrder workOrder1=new WorkOrder();
    	workOrder1.setBudget(1500000);
    	workOrder1.setDescription("CC Roads");
    	workOrder1.setDuration(5);
    	workOrder1.setEstimatedStartDate(new Date());
    	workOrder1.setStatus("Not Started");
    	int workOrderNo1=contractorDao.saveWorkOrder(workOrder1);
    	System.out.println("WorkOderNo "+workOrderNo1);
    	WorkOrder workOrder2=new WorkOrder();
    	workOrder2.setBudget(1500000);
    	workOrder2.setDescription("CC Roads");
    	workOrder2.setDuration(5);
    	workOrder2.setEstimatedStartDate(new Date());
    	workOrder2.setStatus("Not Started");
    	int workOrderNo2=contractorDao.saveWorkOrder(workOrder2);
    	System.out.println("WorkOderNo "+workOrderNo2);
    	
    	Contractor contractor=new Contractor();
    	contractor.setOrgnizationName("Ram Constructions");
    	contractor.setLicenseNo("LIC00020");
    	contractor.setEncorporatedDate(new Date());
    	contractor.setEmailAddress("sales@ramconstructions.com");
    	contractor.setContactNo("9876543210");
    	Map<String,WorkOrder> workOrders=new HashMap<>();
    	workOrders.put("B00010",workOrder1);
    	workOrders.put("B00033",workOrder2);
    	contractor.setWorkOrders(workOrders);
    	int contractorNo=contractorDao.saveContractor(contractor);
    	
    	System.out.println("Contactor No-"+contractorNo);
    	
    	WorkOrder workOrder=(WorkOrder) contractorDao.findObject(1, WorkOrder.class);
    	System.out.println("Finding WorkOrder Details -1 -"+workOrder);
    	
    	Contractor gcontractor=(Contractor) contractorDao.findObject(1, Contractor.class);
    
    	System.out.println("Finding Contractor Details -1 -"+gcontractor.getOrgnizationName());
    }
}
