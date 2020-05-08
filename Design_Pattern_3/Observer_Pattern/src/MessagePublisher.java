import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	
	private List<Observer> observers = new ArrayList<Observer>();
	
	private Message message;
	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		this.observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(Message m) {
		// TODO Auto-generated method stub
		for(Observer o: this.observers)
		{
			o.update(m);
		}
		
	}

	@Override
	public void addMessage(Message m) {
		this.message = m;
		this.notifyUpdate(m);
		
	}
	
 

}
