
public class HR implements ILeaveHandler {

	public ILeaveHandler nextHandler; 
	@Override
	public void HandleRequest(LeaveRequest request) {
		
		if(request.getLeaveDays() > 5)
		{
			System.out.println("Leave Request Handled by HR");
		}
		
		else
		{
			nextHandler.HandleRequest(request);
		}
		
	}
	@Override
	public void setNextHandler(ILeaveHandler handle) {
		nextHandler = handle;
		
	}
	
	
	

}
