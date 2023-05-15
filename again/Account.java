package in.co.rays.oop.again;

public class Account {
	private int Deposite;
	private int withdrawl;
	private String Number;
	private String Type;
	private double Balance;
	
	
	public void setNumber(String Number) {
		this.Number =Number;
	}
	public void setType(String Type){
		this.Type = Type;
		
	}
	public void setBalance(double Balance) {
		this.Balance =Balance;
	}
	public String getNumber() {
		return Number;
	}
	public String getType() {
		return Type;
	}
	public double  getBalance() {
		return Balance;
	}
	public void setDeposite() {
		this.Deposite = Deposite;
		
	}
	public int getDeposite() {
		return Deposite;
		
	}
	public void setWithdrawl(int Withdrawl) {
	this.withdrawl = Withdrawl;
	}
	public int getWithdrawl() {
		return withdrawl;
	}

}
