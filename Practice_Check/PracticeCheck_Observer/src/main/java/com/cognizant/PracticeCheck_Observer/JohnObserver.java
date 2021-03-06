package com.cognizant.PracticeCheck_Observer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class JohnObserver implements INotificationObserver {

	public static final String name="John";
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	public void onServerDown() {
		LOGGER.debug(this.name + ": notification has been received");
		
	}
	@Override
	public String toString() {
		return "[" + name +"]";
	}
}
