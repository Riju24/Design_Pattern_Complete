package com.cognizant.FinalChech_Observer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class AdminTwo implements Admin {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
	public static final String name="AdminTwo";
	public void onHundredTickets() {
		LOGGER.debug(this.name +": More than hundred tickets are booked for the event");
		
	}
	@Override
	public String toString() {
		return "["+name+"]";
	}

}
