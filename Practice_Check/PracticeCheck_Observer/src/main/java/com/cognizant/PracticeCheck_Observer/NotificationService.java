package com.cognizant.PracticeCheck_Observer;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers = new ArrayList<INotificationObserver>();
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		LOGGER.debug("Subscibers in the List are:");
		for(INotificationObserver ob:this.observers)
		{
			LOGGER.debug(ob);
		}
		
	}

	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		LOGGER.debug("Subscibers in the List are:");
		for(INotificationObserver ob:this.observers)
		{
			LOGGER.debug(ob);
		}
		
	}

	public void notifySubscriber() {
		for(INotificationObserver ob:this.observers)
		{
			ob.onServerDown();
		}
		
	}

}
