package oops_inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b1=new BMW();
		b1.start();//overridden
		b1.stop();//inherited
		b1.refuel();//inherited
		b1.engine();//inherited
		b1.autoParking();//own method
		
		Car c=new Car();
		c.start();//own method
		c.stop();//own method
		c.refuel();//own method
		c.engine();//inherited
		
		
		//top casting
		
		Car c1=new BMW();
		c1.start();//overridden
		c1.stop();//inherited
		c1.refuel();//inherited
	//	c1.autoParking();reference type check fails so not allowed
		c1.engine();//inherited
		
		
		//down casting
		
	//	BMW b2=new Car(); not allowed as all cars cannot be BMW's
		
		
		Vehicle v1=new Vehicle();
		v1.engine();
		
		Vehicle v2=new Car();
		v2.engine();
		v2.change();
		System.out.println("-------------------------");
		AeroDynamic ad=new BMW();
		ad.downForce();
		System.out.println("-------------------------");
		Engineering en=new BMW();
		en.fins();
		

	}

}
