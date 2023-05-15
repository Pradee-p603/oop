package in.co.rays.oop;

public class cash {

	private int amount;
	private int deposite;
	private int withdrawl;
	
	cash() {

	}

	public void setamount(int amount) {
		this.amount = amount;

	}

	public int getamount() {
		System.out.println("amount = " + amount);
		return amount;
	}

	public void setdeposite(int deposite) {
		this.deposite = deposite;
	}

	public int getdeposite() {
		amount = deposite + amount;
		System.out.println("total amount after deposite = " + amount);
		return amount;
	}

	public void setwithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}

	public int getwithdrawl() {
		
	int totalamount = amount - withdrawl;
	
	  if (totalamount >= 2000 ) {
			amount = amount - withdrawl;
			System.out.println("amount after withdrawl = " + amount);
			return withdrawl;
		}else{
			System.out.println("your account has insufficient balance");
		System.out.println(amount);
			return withdrawl;
		}
	}
}

