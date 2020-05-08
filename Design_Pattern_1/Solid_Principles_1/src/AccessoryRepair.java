
public class AccessoryRepair implements IAccessoryRepair{

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println("Accesorry repair Accepted for "+accessoryType);
		
	}

	@Override
	public void processOrder(String modelName) {
		System.out.println("Order Accepted for "+modelName);
		
	}

}
