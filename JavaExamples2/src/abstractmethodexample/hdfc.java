package abstractmethodexample;

public class hdfc extends rbi{

	@Override
	void getinterest() {
		System.out.println("interst=10%");
		
	}
public static void main(String args[]) {
	hdfc obj1=new hdfc();
	obj1.regulationalDetails();
	obj1.getinterest();
}
	
}
