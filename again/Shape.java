package in.co.rays.oop.again;

public class Shape {

	
	private String Colour = null;
	private int borderwidth = 0;
	
	public void setColour(String Colour) {
		this.Colour = Colour; 
	}
	public void SetBordeerWidth(int borderWidth) {
		this.borderwidth = borderWidth;
	}
	public String getColour() {
		System.out.println(Colour);
		return Colour;
	}
	public int getborderWidth() {
		System.out.println(borderwidth);
		return borderwidth;
	}
	
}

