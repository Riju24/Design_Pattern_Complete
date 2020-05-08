
public class Supervisor implements ILeaveHandler{

	public ILeaveHandler nextHandler; 
	
	@Override
	public void HandleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<3)
		{
			System.out.println("Leave Request Handled by Supervisor");
		}
		else
		{
			nextHandler.HandleRequest(request);
		}
		
	}
	public void setNextHandler(ILeaveHandler handler)
	{
		nextHandler = handler;
	}
}
