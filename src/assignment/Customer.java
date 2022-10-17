package assignment;

public class Customer {
	String name, city, address;
	int age;

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "raju";
		c1.age = 25;
		c1.city = "pune";
		c1.address = "secondline";
		
		Customer c2 = new Customer();
		c2.name = "gopal";
		c2.age = 30;
		c2.city = "hyderabad";
		c2.address = "beside GSM mall";
		
		Customer c3 = new Customer();
		c3.name = "raghavi";
		c3.age = 34;
		c3.city = "patna";
		c3.address = "opposite to railway station";
		
		Customer c4 = new Customer();
		c4.name = "santhoshi";
		c4.age = 29;
		c4.city = "vizag";
		c4.address = "near metro station";
		
	
		System.out.println(c1.name +" "	+c1.age+" "+c1.city+" "+ c1.address);		
		System.out.println(c2.name +" "	+c2.age+" "+c2.city+" "+ c2.address);		
		System.out.println(c3.name +" "	+c3.age+" "+c3.city+" "+ c3.address);		
		System.out.println(c4.name +" "	+c4.age+" "+c4.city+" "+ c4.address);	
		System.out.println("--------------------------------------------------");
		
		c1=c2;
		System.out.println(c1.name +" "	+c1.age+" "+c1.city+" "+ c1.address);		
		System.out.println(c2.name +" "	+c2.age+" "+c2.city+" "+ c2.address);		
		System.out.println(c3.name +" "	+c3.age+" "+c3.city+" "+ c3.address);		
		System.out.println(c4.name +" "	+c4.age+" "+c4.city+" "+ c4.address);	
		System.out.println("--------------------------------------------------");
		
		c2=c3;
		System.out.println(c1.name +" "	+c1.age+" "+c1.city+" "+ c1.address);		
		System.out.println(c2.name +" "	+c2.age+" "+c2.city+" "+ c2.address);		
		System.out.println(c3.name +" "	+c3.age+" "+c3.city+" "+ c3.address);		
		System.out.println(c4.name +" "	+c4.age+" "+c4.city+" "+ c4.address);	
	
     System.out.println("--------------------------------------------------");
		
		c3=c4;
		System.out.println(c1.name +" "	+c1.age+" "+c1.city+" "+ c1.address);		
		System.out.println(c2.name +" "	+c2.age+" "+c2.city+" "+ c2.address);		
		System.out.println(c3.name +" "	+c3.age+" "+c3.city+" "+ c3.address);		
		System.out.println(c4.name +" "	+c4.age+" "+c4.city+" "+ c4.address);	
		System.out.println("--------------------------------------------------");

		c4=c1;
		System.out.println(c1.name +" "	+c1.age+" "+c1.city+" "+ c1.address);		
		System.out.println(c2.name +" "	+c2.age+" "+c2.city+" "+ c2.address);		
		System.out.println(c3.name +" "	+c3.age+" "+c3.city+" "+ c3.address);		
		System.out.println(c4.name +" "	+c4.age+" "+c4.city+" "+ c4.address);	
	//	System.out.println("--------------------------------------------------");


		
	}

}
