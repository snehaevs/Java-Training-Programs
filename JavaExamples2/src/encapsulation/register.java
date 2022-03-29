package encapsulation;

public class register {
 private String userName;
 private String passWord; 
public void getdetails(String userName, String passWord) {
	this.userName=userName;
	this.passWord=passWord;
}	
public void printdetails() {
	System.out.println("UserName= "+userName+"PassWord= "+passWord);
}
}
