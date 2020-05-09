package com.cognizant.FinalCheck_AbstractFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ElectronicOrder extends Order{

	private static final Logger LOGGER = LogManager.getLogger(Client.class);
	
	public ElectronicOrder(Channel channel) {
		super(ProductType.ELECTRONICS, channel);
	}

	@Override
	void processOrder() {
		LOGGER.debug("Electronic Order is Processing through Channel "+ this.getChannel());
		
	}

}
