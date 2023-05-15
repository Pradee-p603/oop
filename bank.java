package in.co.rays.oop;

public class bank{
	private String number = null;
	private String accountType = null;
	private double balance = 0.0;
	
	public void setnumber(String number ) {
		this.number = number;
		
	}
public void setAccountType(String accounttype) {
	
	this.accountType = accounttype;
	}
	

public void setBalance (double balance) {
	this.balance = balance;
}
public String getNumber() {
	return number;
	
}
public String getAccountType() {
	return accountType;

}
public double getBalance() {
	return balance;
}
}
