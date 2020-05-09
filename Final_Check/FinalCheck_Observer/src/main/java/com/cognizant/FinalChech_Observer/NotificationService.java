package com.cognizant.FinalChech_Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements INotificationService {

	List<Admin> admins = new ArrayList<Admin>();
	
	public void addSubsciber(Admin admin) {
		
		admins.add(admin);
	}

	public void removeSubscriber(Admin admin) {
		admins.remove(admin);
		
	}

	public void notifySubscriber() {
		for(Admin a:this.admins)
		{
			a.onHundredTickets();
		}
		
	}

}
