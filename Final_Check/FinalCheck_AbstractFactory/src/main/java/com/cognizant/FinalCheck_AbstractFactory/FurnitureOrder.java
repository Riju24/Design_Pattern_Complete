package com.cognizant.FinalCheck_AbstractFactory;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FurnitureOrder extends Order {

	private static final Logger LOGGER = LogManager.getLogger(Client.class);
	public FurnitureOrder(Channel channel) {
		super(ProductType.FURNITURE, channel);
		
	}

	@Override
	void processOrder() {
		LOGGER.debug("Furniture Order is Processing through Channel "+ this.getChannel());
		
	}

}
