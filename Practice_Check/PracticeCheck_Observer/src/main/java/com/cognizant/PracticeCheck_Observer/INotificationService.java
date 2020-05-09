package com.cognizant.PracticeCheck_Observer;


public interface INotificationService {

	
	public void addSubscriber(INotificationObserver observer);
	public void removeSubscriber(INotificationObserver observer);
	public void notifySubscriber();
}
