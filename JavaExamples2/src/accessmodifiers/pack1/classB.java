package accessmodifiers.pack1;

public class classB {

	public static void main(String[] args) {
		classA obj2=new classA();
		obj2.b=4;
		obj2.c=5;
		obj2.d=6;
		//private variable of classA cannot be accessed.
		int sum =obj2.b+obj2.c+obj2.d;
		System.out.println(sum);
		//private method of classA cannot be accessed.
obj2.print2();
obj2.print3();
obj2.print4();
	}

}
