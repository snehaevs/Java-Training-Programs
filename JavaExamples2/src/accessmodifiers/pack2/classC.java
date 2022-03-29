package accessmodifiers.pack2;

import accessmodifiers.pack1.classA;

public class classC {

	public static void main(String[] args) {
		classA obj3=new classA();
		//private,protected and default variables/methods cannot be accessed outside the package
		
		obj3.c=6;
		System.out.println(obj3.c);
		obj3.print3();

	}

}
