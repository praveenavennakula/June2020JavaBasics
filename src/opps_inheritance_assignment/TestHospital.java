package opps_inheritance_assignment;

public class TestHospital {

	public static void main(String[] args) {

		// child object1
		Apollo ap = new Apollo();
		ap.noOfDoctors(); // overriden
		ap.noOfNurses();// overriden
		ap.pediatricServices();// independent method
		ap.noOfICUs();// inherited
		System.out.println("--------------------------");
		// child object2
		Fortis fs = new Fortis();
		fs.noOfDoctors(); // inherited
		fs.noOfNurses();// overriden
		fs.orthopedicServices(); // independent method
		fs.noOfICUs();// overriden

		System.out.println("--------------------------");
		Max mx = new Max();
		mx.noOfDoctors();// overriden
		mx.noOfICUs();// overriden
		mx.physioServices();// independent method
		mx.noOfNurses();// inherited
		System.out.println("--------------------------");
        
		Hospital hp=new Hospital();
		hp.noOfDoctors();
		hp.noOfICUs();
		hp.noOfNurses();
		System.out.println("--------------------------");
		//top casting
		//main purpose of top casting is to access overriden methods from 
		//child class,inherited methods from parent class.
		Hospital hp1=new Apollo();
		hp1.noOfDoctors();
		hp1.noOfICUs();
		hp1.noOfNurses();
		
		//down casting
		//compile time
		Max mx1=(Max)new Hospital();//shows class cast exception in runtime
		mx1.noOfDoctors();
		
	}

}
