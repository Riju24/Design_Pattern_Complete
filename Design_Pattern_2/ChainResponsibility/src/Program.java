
public class Program {

	public static void main(String args[])
	{
		LeaveRequest request = new LeaveRequest();
		request.setEmployee("JPP");
		request.setLeaveDays(14);
		
		ILeaveHandler supervisor = new Supervisor();
		ILeaveHandler manager = new ProjectManager();
		ILeaveHandler hr = new HR();
		
		
		manager.setNextHandler(hr);
		supervisor.setNextHandler(manager);
		
		System.out.println("Employee Name :"+request.getEmployee() + " "+"applying for "+request.getLeaveDays());
		supervisor.HandleRequest(request);
		
		System.out.println("\n");
		
		request = new LeaveRequest();
		request.setEmployee("KPP");
		request.setLeaveDays(3);
		System.out.println("Employee Name :"+request.getEmployee() + " "+"applying for "+request.getLeaveDays());
		supervisor.HandleRequest(request);
		
		System.out.println("\n");
		
		request = new LeaveRequest();
		request.setEmployee("HPP");
		request.setLeaveDays(1);
		System.out.println("Employee Name :"+request.getEmployee() + " "+"applying for "+request.getLeaveDays());
		supervisor.HandleRequest(request);
	}
}
