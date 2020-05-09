package com.cognizant.FinalChech_Observer;


public class Event {
	private String name;
	private int noOfTickets;
	
	private INotificationService service;
	
	public Event() {
		super();
	}
	public Event(String name, int noOfTickets) {
		super();
		this.name = name;
		this.noOfTickets = noOfTickets;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
		if(this.noOfTickets>100)
		{
			service.notifySubscriber();
		}
		
	}
	
	public void setINotificationService(INotificationService service)
	{
		this.service = service;
	}
	public INotificationService getINotificationService()
	{
		return this.service;
	}

}
