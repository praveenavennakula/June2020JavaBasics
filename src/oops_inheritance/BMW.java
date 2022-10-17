package oops_inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW......start");
	}
	public void autoParking() {
		System.out.println("BMW......autoParking");
	}

	@Override
	public void downForce() {
		System.out.println("BMW....downForce");
	}
	
	@Override
	public void fins() {
		System.out.println("BMW...fins");
	}
}
