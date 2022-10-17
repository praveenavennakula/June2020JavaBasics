package oops_interface;

public class FortisHospital  implements USMedical, UKMedical, IndianMedical {

	// US Medical
	@Override
	public void pediaServices() {
		System.out.println("FH......pediaServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH......orthoServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH......physioServices");

	}


	// UK medical

	@Override
	public void ENTServices() {
		System.out.println("FH......ENTServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH......cardioServices");

	}

	// Indian Medical

	@Override
	public void oncologyServices() {
		System.out.println("FH......oncologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH......neuroServices");

	}

	// independent
	private void pathologyServices() {
		System.out.println("FH........pathologyServices");
	}
	private void pathologyServices(int i) {
		System.out.println("FH........pathologyServices");
	}

	public void OPDServices() {
		System.out.println("FH........OPDServices");

	}
	
	//common method
	@Override
	public void emergencyServices() {
		System.out.println("FH......emergencyServices");

	}

	@Override
	public void covid19News() {
		System.out.println("FH......covid19News");
		
	}

	@Override
	public void covid19vaccination() {
		System.out.println("FH......covid19vaccination");
		
	}
	
	/*
	 * @Override public void publishMedicalNews() {
	 * System.out.println("FH......publishMedicalNews");
	 * 
	 * 
	 * }
	 */


}
