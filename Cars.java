package in.co.rays.oop;

public class Cars {
	private String Colour = null;
	private int speed =120;
	private String make = null;
	public static int NO_OF_GEARS = 6;
	
	public void setColour( String c) {
	  Colour = c;
		
	}
	public void setspeed(int speed ) {
		this.speed = speed;
	}
	public void setmake(String make) {
		this.make = make;
	}
	public String getColour(){
		return Colour;
	}
	public int getspeed() {
		return speed;
	}
	public String getmake() {
		return make;
	}

}
