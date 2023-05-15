package in.co.rays.oop.again;

public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account();
		a.setBalance(1234.567);
		System.out.println(a.getBalance());
		a.setNumber("22006451234");
		System.out.println(a.getNumber());
		a.setType("saving");
		System.out.println(a.getType());
	}

}
