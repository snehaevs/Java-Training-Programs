package constructors;

public class ElectricityBill {
//variables
	String name;
	String consumernumber;
	int units;
	static int amountpayable;
//parameterized constructor
	public ElectricityBill(String n,String no,int u) {
		name=n;
		consumernumber=no;
		units=u;
		amountpayable=0;
		System.out.println("Customer Name = "+ name);
		System.out.println("Consumer Number = "+consumernumber);
		System.out.println("Units Consumed = "+units);
	}
//method to calculate amount payable
	public int calculatepayable() {
		amountpayable=units*3;
		System.out.println("Amount Payable = "+amountpayable);
		return(amountpayable);
	}
	public static void main(String[] args) {
		ElectricityBill cb = new ElectricityBill("UserName1","ConNum123",100);
		cb.calculatepayable();
		if (amountpayable<100) {
			System.out.println("Slab A");
		}
		else {
			System.out.println("Slab B");
			}
		
		

	}

}
