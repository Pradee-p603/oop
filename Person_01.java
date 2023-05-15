package in.co.rays.oop;

public class Person_01 {
	private String Colour = null;
	private int borderWidth = 0;
	public static final int AVG_AGE = 25;

	public Person_01() {
		System.out.println("this is default constructor");
	}
	 public Person_01(int borderWidth ,String Colour) {
		 this.Colour = Colour;
		 this.borderWidth = borderWidth;
		 System.out.println(Colour+borderWidth);
	 }
	}
	

