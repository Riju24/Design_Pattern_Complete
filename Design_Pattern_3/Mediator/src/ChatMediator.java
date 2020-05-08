import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users;
	
	public ChatMediator()
	{
		this.users = new ArrayList<IUser>();
	}
	
	@Override
	public void addUser(IUser user) {
		
		this.users.add(user);
	}

	@Override
	public void sendMessage(String msg, IUser user) {
		for(IUser u: this.users)
		{
			if(u!=user)
			{
				u.receiveMesage(msg);
			}
		}
	}

}
