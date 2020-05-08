package com.cognizant.Adapter_pattern;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ClientTest {

	@Test
	public void testSpeed() {
		Movable bugatiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter =new MovableAdapterImpl(bugatiVeyron);
        
        Assert.assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

	@Test
	public void testPrice()
	{
		Movable bugatiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter =new MovableAdapterImpl(bugatiVeyron);
        Assert.assertEquals(bugattiVeyronAdapter.getPrice(),1547000.0, 0.001);
	}
}
