package com.cognizant.Adapter_pattern;


public class Client 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Movable bugatiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter =new MovableAdapterImpl(bugatiVeyron);
        
        System.out.print(bugatiVeyron.getSpeed()+"  ");
        System.out.println(bugattiVeyronAdapter.getSpeed());
        
        
        System.out.print(bugatiVeyron.getPrice()+"  ");
        System.out.println(bugattiVeyronAdapter.getPrice());
    }
}
