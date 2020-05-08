
public class Client {

	public static void main(String args[])
	{
		IChatMediator mediator = new ChatMediator();
		
		IUser basic = new BasicUser("JPP",mediator);
		IUser premium = new PremiumUser("Host",mediator);
		
		mediator.addUser(basic);
		mediator.addUser(premium);
		
		premium.sendMessage("Hey JPP");
		System.out.println("<---------------------------->");
		basic.sendMessage("Hello Host");
		
	}
}
