package inheritanceHierarchical;

public class hr extends Employee {
	
	int bonus;
	int allowance;
	public int calculatepackage(){
		int ctc= bonus + basicsalary+1000;
		return ctc;
	}
	public int finalpackage(int a,int allowance) {
		int fctc=a+allowance;
		return fctc;
	}
	public static void main(String[] args) {
		hr a1=new hr();
		a1.onboarding();
		a1.basicsalary=5000;
		a1.bonus=500;
		a1.allowance=100;
		System.out.println("Package= "+	a1.finalpackage(a1.calculatepackage(), a1.allowance));
		
	}}
