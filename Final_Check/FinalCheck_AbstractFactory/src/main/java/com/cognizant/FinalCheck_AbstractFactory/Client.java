package com.cognizant.FinalCheck_AbstractFactory;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;



public class Client {

	private static final Logger LOGGER = LogManager.getLogger(Client.class);
	public static void main(String args[])
	{
		BasicConfigurator.configure();  
		LOGGER.info("Inside Main");
		Order electronics = OrderFactory.build(ProductType.ELECTRONICS, Channel.ECOMMERCE);
		electronics.processOrder();
		
		Order furniture = OrderFactory.build(ProductType.FURNITURE, Channel.TELEAGENTS);
		furniture.processOrder();
		
		Order toy = OrderFactory.build(ProductType.TOYS, Channel.ECOMMERCE);
		toy.processOrder();
		LOGGER.info("End Main");
	}
}
