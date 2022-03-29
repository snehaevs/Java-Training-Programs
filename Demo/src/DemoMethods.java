
public class DemoMethods {

	public static void main(String[] args)
	{
		DemoMethodsLookup a = new DemoMethodsLookup();
		a. getData();
		
		DemoMethods b = new DemoMethods();
		int count = b.Displayname();	
		System.out.println(count);
		int today = DisplayDate();
		System.out.println(today);
		

	}
	
	public int Displayname()
	{
		System.out.println("My Name is Sneha");
		return 10;
	}
 
	public static int DisplayDate()
	{
		return 25;
	}
	
}
