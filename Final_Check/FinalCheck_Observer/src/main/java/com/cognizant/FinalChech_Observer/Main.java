package com.cognizant.FinalChech_Observer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Main {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	
	public static void main(String args[])
	{
		BasicConfigurator.configure();  
		LOGGER.info("Inside Main");
		Event fest = new Event();
		INotificationService service = new NotificationService();
		
		
		fest.setName("College Fest");
		fest.setINotificationService(service);
		
		Admin a = new AdminOne();
		Admin b = new AdminTwo();
		
		fest.getINotificationService().addSubsciber(a);
		fest.getINotificationService().addSubsciber(b);
				
		fest.setNoOfTickets(200);
		
		fest.getINotificationService().removeSubscriber(b);
		
		System.out.println();
		fest.setNoOfTickets(300);
		LOGGER.info("End Main");
	}
}
