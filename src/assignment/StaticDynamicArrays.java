package assignment;

import java.util.Arrays;

public class StaticDynamicArrays {
	
	public String[] getDevicesList(String empName) {
	
	String devicesList[]=new String[5];
	
	if(empName.equalsIgnoreCase("ramu")) {
		devicesList[0]= "iPhone10";
		devicesList[1]="Mac Pro";
		devicesList[2]="Airtel SIM";
	}else if(empName.equalsIgnoreCase("sita")) {
		devicesList[0]= "samsung";
		devicesList[1]="Mac book air";
	
	}else if(empName.equalsIgnoreCase("lakshman")) {
		devicesList[0]= "nokia";
		devicesList[1]="dell";
		devicesList[2]="Cannon";
	}else {
		System.out.println("emp name not found....." +empName);
	}
	return devicesList;
	}

	public static void main(String[] args) {
		
		StaticDynamicArrays sta=new StaticDynamicArrays();
		String devicesList[]=new String[5];
		devicesList= sta.getDevicesList("Ramu");
		
		/*
		 * for(String e:devicesList) { System.out.println(e); }//this gives me null values for the remaining unoccupied places
		 */
		System.out.println(Arrays.asList(devicesList));
		
		
	}

}
