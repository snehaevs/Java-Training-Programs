package inheritanceMultilevel;

public class studentGrade extends scoreValue {
	 char grade;
	 char findgrade(int a) {
		
		if (a>150) {
			System.out.println("Eligible for promotion");
		}
		else {
			System.out.println("Not eligible for promotion");
		}
		
		if (a>=90) {
		    grade='A';
		}
		else if (a>=80) {
		    grade='B';
		}
		else if (a>=70) {
		    grade='C';
		}
		else if (a>=60) {
		    grade='D';
		}
		else if (a>=50) {
		    grade='E';
		}
		else if (a>=40) {
		    grade='F';
		}
		else {
			grade='G';
		}
		return grade;
	}
	

	public static void main(String[] args) {
		studentGrade SG1=new studentGrade();
		SG1.totalmarks(10,10,15);
		SG1.avgmarks(SG1.total);
		SG1.findgrade(SG1.score);
		System.out.println("Grade= "+SG1.grade);
		
		studentGrade SG2=new studentGrade();
		SG2.totalmarks(80,80,80);
		SG2.avgmarks(SG2.total);
		SG2.findgrade(SG2.score);
		System.out.println("Grade= "+SG2.grade);
		
		
		

	}

}
