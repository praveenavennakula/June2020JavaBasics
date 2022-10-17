package oops_encapsulation_assignment;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setName("vasu");
		e.setAge(10);
		e.setSalary(12900);
		e.setActive(true);
		e.setGender('f');
		ArrayList<Object> empdata=e.getEmployeeInfo();
		for(Object c: empdata) {
			System.out.println(c);
		}
		
	}

}
