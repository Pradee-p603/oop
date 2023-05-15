package in.co.rays.oop.again;

import java.util.Date;

public class Person1 {
	
	private String name = null;
	private Date dob = null;
	private String address =null;
	public static final int  AVG_AGE = 20;

	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDob(Date dob) {
		this.dob = dob ;
		
	}
	public Date getDob() {
		return dob;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
	public String getAddress() {
		return address;
	}
	
	}


