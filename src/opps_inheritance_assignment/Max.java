package opps_inheritance_assignment;

public class Max extends Hospital{
	
	@Override
	public void noOfDoctors() {
		System.out.println("Max....number of doctors");
	}
	
	@Override
	public void noOfICUs() {
		System.out.println("Max....number of ICUs");
	}
	
	public void physioServices() {
		System.out.println("Max...PhysioServices");
	}

}
