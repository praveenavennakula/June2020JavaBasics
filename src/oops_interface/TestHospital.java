package oops_interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.emergencyServices();
	//	USMedical usm=new USMedical();  we cannot create object for interface
		
		Medical md=new Medical();
		md.medicalReasearch();
		
		//top casting 
		
		USMedical usm=new FortisHospital();
		usm.pediaServices();
		
		WHO wh=new FortisHospital();
		wh.covid19News();
		
	//	Medical md1=new FortisHospital();
		//md1.publishMedicalNews();
	//	USMedical usm1= (USMedical) new Medical(); class cast exception
		
		
		
		

	}

}
