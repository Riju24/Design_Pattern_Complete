
public abstract class Factory {

	public abstract Headlight makeHeadlight();
	public abstract Tire makeTire();
	
	public static Factory getInstace(String instance)
	{
		Factory f=null;
		if(instance.contentEquals("mercedes"))
		{
			f= new MecedesFactory();
		}
		else
		{
			f= new AudiFactory();
		}
		
		return f;
	}
}
