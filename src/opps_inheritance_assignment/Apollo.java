package opps_inheritance_assignment;

public class Apollo extends Hospital{
	
	@Override
	public void noOfDoctors() {
		System.out.println("Apollo....number of Doctors");
	}
	
	@Override
	public void noOfNurses() {
		System.out.println("Apollo....number of nurses");
	}
	
	public void pediatricServices() {
		System.out.println("Apollo....pediatric services");
	}

}
