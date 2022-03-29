import java.util.ArrayList;

public class JavaExamples {

	public static void main(String[] args) {
		
		String[] Fruits = new String[5];
 		Fruits[0]="Apple";
 		Fruits[1]="Orange";
 		Fruits[2]="Grapes";
 		Fruits[3]="Banana";
 		Fruits[4]="Mango";
// To print the array
 		for (int i=0; i<Fruits.length ; i++)
 		{
 			System.out.println(Fruits[i]);
 			
 		}
// To print the array
 		for (String s:Fruits)
 		{
 			System.out.println(s);
 		}
//print only even numbers from the below array till it finds a multiple of 5
 		
 		int[] numarr = {1,2,3,4,5,6,7,8,9};
 	for (int i=0; i<numarr.length ;i++)
 		
 	{
 		if (numarr[i] % 2 == 0)
 		System.out.println(numarr[i]);
		if (numarr[i]%5==0)
 		{
  			System.out.println("Array has multiple of 5");	
  			break;
 		}
		
 	}
 //Array List, values as well as size can be defined and increased on the go.	
 	ArrayList<String> a=new ArrayList<String>();
 	a.add("Apple");
 	a.add("Orang");
 	a.add("Mango");
 	a.add("PineApple");
 	a.add("Melon");
 	a.add("Water Melon");
 	System.out.println(a.get(4));
 	
 	ArrayList b=new ArrayList();
 	b.add(10);
 	b.add(100);
 	b.add(1000);
 	b.add(8);
 	b.add(11);
 	b.add(111);
 	b.add(1111);
 	b.remove(3);
 	System.out.println(b.get(3));
 	
//String literal
 	//String s1 = ("My Name is Sneha"); 
 	//String s2 = ("My Age is 31");
//String using new memory allocator
 	//String s3 = new String ("My Name is RED");
 	//String s4 = new String ("My Name is RED");
//Print splitted string array 	
 	String s = new String ("One Two Three");
 	String[] r = s.split(" ");
 	for (int i=0;i < r.length;i++)
 	{
 		System.out.println(r[i]);
	}
 	
//Print String in reverse order
 	String t =("Test Complete");
 	for (int i=t.length()-1;i >=0;i--)
 	{
 		System.out.println(t.charAt(i));
	}
 	
 	
	}

}