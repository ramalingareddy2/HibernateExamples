package com.mtm.entities;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;
@Data
public class Channel implements Serializable {
	protected int channelNo;
	protected String ChannelName;
	protected String language;
	protected boolean hd;
	protected double subscriptionPrice;
	//protected Set<DTHPackage> dthPackages;
}
