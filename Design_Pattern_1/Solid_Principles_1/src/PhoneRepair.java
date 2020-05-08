
public class PhoneRepair implements IPhoneRepair{

	@Override
	public void processOrder(String modelName) {
		System.out.println("Order Accepted for "+modelName);
		
	}

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println("Phone Repair Accepted for "+modelName);
		
	}

}
