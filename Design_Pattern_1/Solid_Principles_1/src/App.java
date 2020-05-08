import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {


	public static void main(String args[]) throws IOException
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Welcome to our site. Would you like to order or repair");
			
			String option = br.readLine();
			
			PhoneRepair phoneRepair = new PhoneRepair();
			AccessoryRepair accessoryRepair = new AccessoryRepair();
			
			switch(option)
			{
				case "order": System.out.println("Please provide the phone Model Name");
							  String model = br.readLine();
							  phoneRepair.processOrder(model);
							  break;
							  
				case "repair": System.out.println("Is it phone or accessory that you want to repair");
							 	String type = br.readLine();
							 	if(type.contentEquals("phone"))
							 	{
							 		System.out.println("Please provide the Product detail");
							 		String detail = br.readLine();
							 		phoneRepair.processPhoneRepair(detail);
							 	}
							 	else
							 	{
							 		System.out.println("Please provide the Product detail");
							 		String detail = br.readLine();
							 		accessoryRepair.processAccessoryRepair(detail);
							 	}
							 	
							 	break;
			
				default:break;
			
			}
			
	}
}
