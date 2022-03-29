package finalKeyword;

public class finalmethodsubclass extends finalmethod {
	//void methodfinal() -- cannot override final method
	{
		System.out.println("this is a final method of subclass");
	}

	public static void main(String[] args) {
		finalmethod v2=new finalmethod();
		v2.methodfinal();

	}

}
