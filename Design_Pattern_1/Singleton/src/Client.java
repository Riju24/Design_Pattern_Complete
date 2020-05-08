
public class Client {

	private static DBConn con;
	
	public static void main(String args[])
	{
		
		System.out.println("Example of Singleton Method of creation of Object");
		
		con = DBConn.getInstance();
		
		System.out.println("Object created sucessfully");

	}
}
