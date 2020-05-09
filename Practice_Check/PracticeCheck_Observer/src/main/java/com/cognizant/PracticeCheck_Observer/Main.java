package com.cognizant.PracticeCheck_Observer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Main {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);

	public static void main(String args[])
	{
		BasicConfigurator.configure(); 
		INotificationService service = new NotificationService();
		
		LOGGER.info("Inside Main");
		
		INotificationObserver steave = new SteaveObserver();
		INotificationObserver john = new JohnObserver();
		
		service.addSubscriber(steave);
		
		
		service.addSubscriber(john);
		
		
		service.notifySubscriber();
		
	
		
		service.removeSubscriber(john);
		
		
		service.notifySubscriber();
		LOGGER.info("End Main");
		
	}
}
