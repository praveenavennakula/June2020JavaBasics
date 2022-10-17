package assignment;

import java.util.Arrays;

public class StringManuplationAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="i am a software tester";
		String s2="i am not a software tester";
		String s3="i am a software tester";
		String s4="i am a    software tester";

		
		//1.  Write a program to check two different strings equality.
		boolean b1=s1.equals(s2);
		System.out.println(b1);
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		
	//	2. Remove all  spaces in a String . 

		
//		  For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.
		
		String main = "welcome to     testing     world testing naveen testing";
		System.out.println(main.contains("testing"));
		
		System.out.println(main.replaceAll("\\s+", " "));
		
		String s5="            Hello      Everyone       ";
		
		  System.out.println(s5.length()); 
		  System.out.println(s5.replaceAll("\\s+"," ")); // Hello      Everyone //not working
		  String s6=s5.replaceAll("\\p{Zs}+", "");//refer https://stackoverflow.com/questions/4731055/whitespace-matching-regex-java/4731164#4731164
		  System.out.println(s6.length()); 
		  System.out.println(s6);
		 
		
	}

}
