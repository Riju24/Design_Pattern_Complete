package com.cognizant.FinalChech_Observer;


public interface INotificationService {

	public void addSubsciber(Admin admin);
	public void removeSubscriber(Admin admin);
	public void notifySubscriber();
}
