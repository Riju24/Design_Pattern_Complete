package com.cognizant.PraciceCheck_AbstractFactory;


public abstract class CarFactory {

	
	public static void buildCar(CarType type, Location loc) 
	{
		
		if(loc==Location.INDIA)
		{
			new IndiaCarFactory().construct(type);;
		}
		else if(loc==Location.USA)
		{
			new USACarFactory().construct(type);;
		}
		else
		{
			new DefaultCarFactory().construct(type);;
		}
	}
	
	public abstract void construct(CarType type);
}
