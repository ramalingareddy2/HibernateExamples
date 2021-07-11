package com.mtm.test;

import java.util.HashSet;
import java.util.Set;

import com.mtm.dao.DTHPackageDao;
import com.mtm.entities.Channel;
import com.mtm.entities.DTHPackage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DTHPackageDao dao=new DTHPackageDao();
//    	Channel channel1=new Channel();
//    	channel1.setChannelName("Gemini");
//    	channel1.setHd(true);
//    	channel1.setLanguage("Telugu");
//    	channel1.setSubscriptionPrice(30);
//    	
//    	Channel channel2=new Channel();
//    	channel2.setChannelName("Gemini");
//    	channel2.setHd(true);
//    	channel2.setLanguage("Telugu");
//    	channel2.setSubscriptionPrice(30);
//    	
//    	int channelNo1=dao.save(channel1);
//    	int channelNo2=dao.save(channel2);
//    	System.out.println("ChannelNo1-"+channelNo1);
//    	System.out.println("ChannelNo2-"+channelNo2);
//    	Set<Channel> channels=new HashSet<>();
//    	channels.add(channel1);
//    	channels.add(channel2);
//    	DTHPackage dthPackage=new DTHPackage();
//    	dthPackage.setActivationCode("TATAA109927");
//    	dthPackage.setChannels(channels);
//    	dthPackage.setMonthlyCharges(320);
//    	dthPackage.setPackageName("South Region");
//    	dthPackage.setRegion("South");
//    	
//    	int dthPackNo=dao.save(dthPackage);
//    	System.out.println("DTHPackNo-"+dthPackNo);
    	
    	System.out.println(dao.findObject(1, DTHPackage.class));
        System.out.println( "Hello World!" );
    }
}
