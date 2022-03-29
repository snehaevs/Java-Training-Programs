
public class StringDemo {

	public static void main(String[] args) {
		String s = new String ("Hello World");
		String[] r = s.split(" ");
		
		for (int i=0;i<=r[0].length()-1;i++)
		{
		System.out.println(r[0].charAt(i));
		}

	}

}
