package com.cognizant.PraciceCheck_AbstractFactory;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class CarClient {

	private static final Logger LOGGER = LogManager.getLogger(CarClient.class);
	
	public static void main(String args[])
	{
		BasicConfigurator.configure();  
		LOGGER.info("Inside main");
		CarFactory.buildCar(CarType.LUXURY,Location.USA);
		CarFactory.buildCar(CarType.MINI,Location.INDIA);
		CarFactory.buildCar(CarType.LUXURY,Location.DEFAULT);
		LOGGER.info("End main");
	}
}
