
public class BasicUser implements IUser {

	private String name;
	private IChatMediator chatMediator; 
	
	
	public BasicUser(String name, IChatMediator mediator)
	{
		this.name = name;
		chatMediator = mediator;
	}
	
	@Override
	public void sendMessage(String msg) {
		System.out.println(name+" sends:  "+msg);
		chatMediator.sendMessage(msg,this);
	}

	@Override
	public void receiveMesage(String msg) {
		
		System.out.println(name+" received:  "+msg);
	}

}
