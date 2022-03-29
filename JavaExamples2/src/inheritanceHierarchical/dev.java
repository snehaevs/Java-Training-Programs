package inheritanceHierarchical;

public class dev extends Employee {

	int bonus;
	public int calculatepackage(){
		int ctc= bonus + basicsalary;
		return ctc;
	}
	public static void main(String[] args) {
		dev a1=new dev();
		a1.onboarding();
		a1.basicsalary=1000;
		a1.bonus=100;
		System.out.println("CTC= "+a1.calculatepackage());
		
	}

}
