package in.co.rays.oop.again;

import java.text.ParseException;

import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person1 p = new Person1();
		
	

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		p.setName("patel shaab");
		p.setAddress("bhopal");
		p.setDob(sdf.parse("17/03/2000"));
 
		System.out.println(p.getAddress());
		System.out.println(sdf.format(p.getDob()));
		System.out.println(p.getName());

	}

}
