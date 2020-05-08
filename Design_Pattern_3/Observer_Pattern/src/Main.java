
public class Main {

	public static void main(String args[])
	{
		Observer s1 = new MessageSubscriberOne();
		Observer s2 = new MessageSubscriberTwo();
		Observer s3 = new MessageSubscriberThree();
		
		Subject p = new MessagePublisher();
		
		p.attach(s1);
		p.attach(s2);
		
		//p.notifyUpdate(new Message("First Message"));
		
		p.addMessage(new Message("First Message"));
		
		p.detach(s1);
		p.attach(s3);
		
		System.out.println();
		
		//p.notifyUpdate(new Message("Second Message"));
		
		p.addMessage(new Message("Second Message"));
		
	}
}
