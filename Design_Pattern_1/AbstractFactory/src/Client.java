import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome to the Factory");
		System.out.println("Which Company you want to choose : Mercedes or Audi");
		
		String company = br.readLine();  
		
		Factory factory = Factory.getInstace(company);
		
		System.out.println("What do you want to make : Tire or Headlight");
		
		String order = br.readLine();
		
		if(order.contentEquals("tire"))
		{
			Tire tire = factory.makeTire();
			tire.print();
		}
		
		else
		{
			Headlight headlight = factory.makeHeadlight(); 
			headlight.print();
		}
	}
	
}
