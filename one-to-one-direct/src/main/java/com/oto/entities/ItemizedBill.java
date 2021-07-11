package com.oto.entities;

import lombok.Data;

@Data
public class ItemizedBill {
	protected int billNo;
	protected int localCallMins;
	protected int internationalCallMins;
	protected int dataConsumed;
	protected int voiceCallCharges;
	protected int dataCharges;
	protected Bill bill;

}
