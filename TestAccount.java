package in.co.rays.oop;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(4000);
	System.out.println(	a.getBalance());
		a.deposite(2000);
		a.withdrawl(4001);
		
	}

}
