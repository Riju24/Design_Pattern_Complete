package com.cognizant.FinalCheck_AbstractFactory;


public abstract class OrderFactory {

	public static Order build(ProductType product,Channel channel)
	{
		if(channel == Channel.ECOMMERCE)
		{
			return new EcommerceChannelFactory().construct(product);
		}
		
		return new TeleagentsChannelFactory().construct(product);
	}
	
	public abstract Order construct(ProductType product);
}
