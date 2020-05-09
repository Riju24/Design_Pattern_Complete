package com.cognizant.PraciceCheck_AbstractFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class MiniCar extends Car {

	private static final Logger LOGGER = LogManager.getLogger(CarClient.class);
	public MiniCar(Location location) {
		super(CarType.MINI, location);
		LOGGER.debug(construct());
	}

	@Override
	String construct() {
		// TODO Auto-generated method stub
		return("Connecting to Mini Car");
	}

}
