
public class ProjectManager implements ILeaveHandler{

	public ILeaveHandler nextHandler; 
	@Override
	public void HandleRequest(LeaveRequest request) {
		if(request.getLeaveDays()<5)
		{
			System.out.println("Leave Request Handled by Project Manager");
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
