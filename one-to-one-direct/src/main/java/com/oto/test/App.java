package com.oto.test;

import java.util.Date;

import com.oto.dao.BillDao;
import com.oto.entities.Bill;
import com.oto.entities.ItemizedBill;

public class App {
	public static void main(String[] args) {
		BillDao billDao=new BillDao();
		Bill bill=new Bill();
		bill.setAmount(1000);
		bill.setBillGeneratedDate(new Date());
		bill.setConsumerName("Rick");
		bill.setDueDate(new Date());
		int billNo=billDao.save(bill);
		System.out.println("Bill No Saved-"+billNo);
		ItemizedBill itemizedBill=new ItemizedBill();
		itemizedBill.setBill(bill);
		itemizedBill.setDataCharges(100);
		itemizedBill.setDataConsumed(100);
		itemizedBill.setInternationalCallMins(2000);
		itemizedBill.setLocalCallMins(100000);
		itemizedBill.setVoiceCallCharges(900);
		
		int itemizedBillNo=billDao.save(itemizedBill);
		
		System.out.println("Itemized Bill No"+itemizedBillNo);
		
		System.out.println(billDao.findObject(1,ItemizedBill.class));
		
		
	}

}
