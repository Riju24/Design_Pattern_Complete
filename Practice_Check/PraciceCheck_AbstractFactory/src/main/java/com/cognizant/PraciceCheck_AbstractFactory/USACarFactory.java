package com.cognizant.PraciceCheck_AbstractFactory;

public class USACarFactory extends CarFactory{

	@Override
	public void construct(CarType type) {
		if(type==CarType.LUXURY)
		{
			new LuxuryCar(Location.USA);
		}
		else if(type==CarType.MICRO)
		{
			new MicroCar(Location.USA);
		}
		else
		{
			new MiniCar(Location.USA);
		}
		
	}

}
