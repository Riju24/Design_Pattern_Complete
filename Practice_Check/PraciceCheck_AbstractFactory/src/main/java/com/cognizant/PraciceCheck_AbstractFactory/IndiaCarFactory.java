package com.cognizant.PraciceCheck_AbstractFactory;

public class IndiaCarFactory extends CarFactory {

	@Override
	public void construct(CarType type) {
		// TODO Auto-generated method stub
		
		if(type==CarType.LUXURY)
		{
			new LuxuryCar(Location.INDIA);
		}
		else if(type==CarType.MICRO)
		{
			new MicroCar(Location.INDIA);
		}
		else
		{
			new MiniCar(Location.INDIA);
		}
		
	}

}
