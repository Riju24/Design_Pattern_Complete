package com.cognizant.Adapter_pattern;

public class MovableAdapterImpl implements MovableAdapter{

	private Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	public MovableAdapterImpl() {
		super();
	}

	public double getSpeed() {
		
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	public double getPrice() {
		
		return convertUSDtoEuro(luxuryCars.getPrice());
	}
	
	private double convertMPHtoKMPH(double mph)
	{
		return mph*1.60934;
	}
	
	private double convertUSDtoEuro(double usd)
	{
		return usd*0.91;
	}
}
