
public class DBConn {

	private static DBConn dbcon;
	
	private DBConn()
	{
		
	}
	
	public static DBConn getInstance()
	{
		dbcon = new DBConn();
		return dbcon;
	}
}
