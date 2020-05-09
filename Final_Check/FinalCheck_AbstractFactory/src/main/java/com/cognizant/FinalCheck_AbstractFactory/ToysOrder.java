package com.cognizant.FinalCheck_AbstractFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ToysOrder extends Order{

	private static final Logger LOGGER = LogManager.getLogger(Client.class);
	public ToysOrder(Channel channel) {
		super(ProductType.TOYS, channel);
	}

	@Override
	void processOrder() {
		LOGGER.debug("Toy Order is Processing through Channel "+ this.getChannel());
		
	}
	

}
