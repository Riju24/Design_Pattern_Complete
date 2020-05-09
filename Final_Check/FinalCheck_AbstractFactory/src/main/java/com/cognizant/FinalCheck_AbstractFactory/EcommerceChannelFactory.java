package com.cognizant.FinalCheck_AbstractFactory;

public class EcommerceChannelFactory extends OrderFactory{

	@Override
	public Order construct(ProductType product) {
		if(ProductType.ELECTRONICS == product)
		{
			return new ElectronicOrder(Channel.ECOMMERCE);
		}
		else if(ProductType.FURNITURE == product)
		{
			return new FurnitureOrder(Channel.ECOMMERCE);
		}
		
		return new ToysOrder(Channel.ECOMMERCE);
		
	}

}
