package com.cognizant.PraciceCheck_AbstractFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MicroCar extends Car {
	private static final Logger LOGGER = LogManager.getLogger(CarClient.class);

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		
		LOGGER.debug(construct());
	}

	@Override
	String construct() {
		// TODO Auto-generated method stub
		return ("Connecting to Micro Car");
	}

}
