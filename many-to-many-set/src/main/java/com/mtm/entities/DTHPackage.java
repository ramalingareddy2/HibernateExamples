package com.mtm.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;

@Data
public class DTHPackage implements Serializable{
	protected int dthPackageNo;
	protected String packageName;
	protected String region;
	protected double monthlyCharges;
	protected String activationCode;
	protected Set<Channel> channels;

}
