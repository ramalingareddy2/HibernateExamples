package com.aotod.test;

import java.util.Date;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.aotod.entities.ElectricityBill;
import com.aotod.entities.Receipt;
import com.aotod.helper.EnitityManagerFactoryHelper;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=null;
		EntityManager em=null;
		EntityTransaction transaction=null;
		ElectricityBill electricityBill=null;
		Receipt receipt=null;
		boolean flag=false;
		
		try {
			emf=EnitityManagerFactoryHelper.getEmf();
			em=emf.createEntityManager();
			transaction=em.getTransaction();
			transaction.begin();
			
			electricityBill=new ElectricityBill();
			electricityBill.setBillAmount(327);
			electricityBill.setConsumerNo("CN100272");
			electricityBill.setServiceNo("SVCN985342");
			electricityBill.setUnitsConsumed(100);
			
			em.persist(electricityBill);
			
			receipt=new Receipt();
			receipt.setAmount(327);
			receipt.setTransactionNo(UUID.randomUUID().toString());
			receipt.setPaidDate(new Date());
			receipt.setElectricityBill(electricityBill);
			
			em.persist(receipt);
			flag=true;
		}finally {
			if(transaction!=null) {
				if(flag) {
					transaction.commit();
				}else {
					transaction.rollback();
				}
			}
			if(em!=null) {
				em.close();
			}
		}
		
		
	}

}
