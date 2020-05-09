package com.cognizant.PraciceCheck_AbstractFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LuxuryCar extends Car{

	private static final Logger LOGGER = LogManager.getLogger(CarClient.class);
	
	public LuxuryCar(Location location) {
		
		super(CarType.LUXURY, location);
		
		LOGGER.debug(construct());
	}

	@Override
	String construct() {
		// TODO Auto-generated method stub
		return "Connecting to Luxury Car";
	}

}
