package in.co.rays.oop;

public class TestCars {
	public static void main(String[] args) {

	    Cars c = new Cars();
		
		c.setColour("red");
		
		System.out.println(c.getColour());
		
		c.setmake("mahindra");
		
		System.out.println(c.getmake());
		
		c.setspeed(100);
		
		System.out.println(c.getspeed());
		
		System.out.println(Cars.NO_OF_GEARS);
	}
}
