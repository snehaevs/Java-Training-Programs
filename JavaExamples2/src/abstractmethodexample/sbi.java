package abstractmethodexample;

public class sbi extends rbi{
	
	public void getinterest() {
		System.out.println("interest 7%");
	}

	public static void main(String[] args) {
		sbi obj1=new sbi();
		obj1.regulationalDetails();
		obj1.getinterest();
		
	}

}
