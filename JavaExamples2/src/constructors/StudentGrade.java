package constructors;

class StudentGrade {
//variables	
 String studentname;
 int m1,m2,m3;



//parameterized constructor
 public StudentGrade(int a,int b,int c,String n)
			{
				studentname = n;
				m1=a;
				m2=b;
				m3=c;	
				System.out.println(studentname);
			}
 //method to calculate total
 public  int findtotalmarks()
 {
 int total=m1+m2+m3;
 return(total);
 }
 //method to calculate average marks
 public int avgmarks(int total) 
 {
	 int avg=total/3;
	 return (avg);
 }
//method to find grade
public void findGrade(int avg) 
{
	if (avg>=90) {
		System.out.println("Grade A");
		}
	else if ( avg>=80) {
	System.out.println("Grade B");
	}
	else if (avg>=70) {
		System.out.println("Grade C");
		}
	else if( avg>=60) {
		System.out.println("Grade D");
		}
	else if( avg>=50) {
		System.out.println("Grade E");
		}
	else {
	System.out.println("Grade F");
	}
}
public static void main (String args[]) 
{
	//for Student 1
	StudentGrade s1=new StudentGrade(10,20,30,"Sneha");
   int total= s1.findtotalmarks();
	System.out.println("TotalMarks = "+total);
	int avg=s1.avgmarks(total);
	System.out.println("AvgMArks = "+avg);
	s1.findGrade(avg);
	//for Student 2
	StudentGrade s2=new StudentGrade(80,80,80,"Ann");
	total=s2.findtotalmarks();
	System.out.println("TotalMarks = "+total);
	avg=s2.avgmarks(total);
	System.out.println("AvgMArks = "+avg);
	s2.findGrade(avg);
    	
}
	
	

}
			
		

	


