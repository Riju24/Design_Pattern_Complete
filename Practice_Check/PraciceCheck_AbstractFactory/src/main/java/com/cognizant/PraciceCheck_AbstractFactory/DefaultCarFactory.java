package com.cognizant.PraciceCheck_AbstractFactory;

public class DefaultCarFactory extends CarFactory{

	@Override
	public void construct(CarType type) {
		if(type==CarType.LUXURY)
		{
			new LuxuryCar(Location.DEFAULT);
		}
		else if(type==CarType.MICRO)
		{
			new MicroCar(Location.DEFAULT);
		}
		else
		{
			new MiniCar(Location.DEFAULT);
		}
		
	}

}
