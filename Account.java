package in.co.rays.oop;

public class Account {
	private int Balance = 0;
	
	public void setBalance(int balance) {
		this.Balance = balance;
		
	}
	public int getBalance() {
//		System.out.println("balance = " + Balance);
		return Balance;
	}
	public void deposite(int deposite) {
		int Total = getBalance() + deposite;
		setBalance (Total);
		System.out.println("Balance after depoisite= "+ Total);
	}
	public void withdrawl(int Withdrawn) {
		int Total = getBalance() - Withdrawn;
		if(Total >= 2000) {
			Balance = getBalance() - Withdrawn;
			System.out.println("balance after Withdrawn ="+ Balance);
		}else {
			System.out.println("pese hai apke account me jo withdrawl karne aa gye.....!!! ");
		}
	}
	
	

}
