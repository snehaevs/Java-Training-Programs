package inheritance;
//sports car variables

public class sportsCar extends car{
String gps;
public void getsportscardetails(String gps) {
	System.out.println(gps);
}
	public static void main(String[] args) {
		sportsCar obj1=new sportsCar();
		obj1.getcardetails("i20","5 Seater");
		obj1.colour="White";
		obj1.getsportscardetails("GPS");
		
		sportsCar obj2=new sportsCar();
		obj2.colour="Red";
		obj2.getcardetails("Espresso", "4");
		obj1.getsportscardetails("no GPS");
		
		

	}

}
