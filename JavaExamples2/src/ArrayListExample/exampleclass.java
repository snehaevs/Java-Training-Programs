package ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class exampleclass {

	public static void main(String[] args) {
		ArrayList <String> a1= new ArrayList<>();
		a1.add("one");
		a1.add("Two");
		a1.add("Three");
		System.out.println(a1);
		System.out.println(a1.get(1));
		System.out.println(a1.size());
		a1.set(0, "First");
		System.out.println(a1.get(0));
		a1.remove(1);
		System.out.println(a1);
		a1.add("Second");
		System.out.println(a1);
		//Iterator<String> is an interface which has methods hasnext() ,next()
		//a1.iterator() is a method whose return type is Iterator interface
		Iterator<String> b1=a1.iterator();
		while(b1.hasNext()) {
			String c = b1.next();
			System.out.println(c);
		}
		
		

	}

}
