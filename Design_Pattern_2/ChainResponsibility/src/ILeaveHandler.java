
public interface ILeaveHandler {

	void HandleRequest(LeaveRequest request);
	void setNextHandler(ILeaveHandler handle);
}
