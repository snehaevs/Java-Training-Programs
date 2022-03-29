package accessmodifiers.pack1;

public class classA {
	//instance variables
			private int a;
			int b;
			public int c;
			protected int d;
	//instance method1
			private void print1() {
				
			System.out.println("private method of class A called")	;
			}
			void print2() {
			System.out.println("Default method of class A called")	;
			}
			public void print3() {
				System.out.println("public method of class A called")	;	
			}
			protected void print4(){
				System.out.println("protected method of class A called")	;	
			}
	public static void main(String[] args) {
		classA obj1=new classA();
		obj1.a=1;
		obj1.b=2;
		obj1.c=3;
		int sum=obj1.a+obj1.b+obj1.c;
		System.out.println(sum)	;
		obj1.print1();
		obj1.print2();
		obj1.print3();
		

	}

}
