package in.co.rays.oop;

import java.text.SimpleDateFormat;

public class Person {
		private String name = null;
		private String address = null;
		private int dob = 0;
		public static int AVG_Age = 24;
		public void setName(String name) {
			this.name = name;
			SimpleDateFormat sdf = new SimpleDateFormat();
			
			
		}
		public void setDob(int dob) {
			this.dob = dob;
		}
		public void setAddress(String address){
			this.address = address;
		}
		public String getaddress() {
			return address;
		}
		public String getName() {
			return name;
		}
		public int getdob() {
			return dob;
		}
	 
			
		}
	


	


