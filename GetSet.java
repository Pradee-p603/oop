package in.co.rays.oop;

public class GetSet {
	GetSet(){};
		 private String Colour = null;
		private int borderWidth = 0;
		
		
		public void setColour(String c ) {
			  Colour = c;
		}
		public String getColour() {
			return Colour;
		}
		public void setborderWidth(int bw) {
			borderWidth = bw;
			  
		}
		public int getborderWidth() {
			return borderWidth;
		}
		
	}

