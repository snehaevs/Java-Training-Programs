package finalKeyword;

public class finalvariable {

	final int sum=0;
	int total;
	
	public void add(int a,int b) {
		//sum=a+b; value of final variable cannot be changed
		total=a+b;
		System.out.println(total);
	}
	public static void main(String[] args) {
		finalvariable v1=new finalvariable();

		v1.add(1,2);

	}

}
