package in.co.rays.oop;

public class TestAc {
public static void main(String[] args) {
	  bank b = new bank();
	  b.setnumber("pradeep");
	  System.out.println(b.getNumber());
	  b.setAccountType("saving");
	  System.out.println(b.getAccountType());
	  b.setBalance(1234.34);
	  System.out.println(b.getBalance());
}

}
