package oops_strings;

public class StringConcept {

	public static void main(String[] args) {

	String str="hi this is my java code";
	String str1="Hi this is my java code";
	String str2="Hi this is your java code";
	String str3="hi this is my java code";
	System.out.println(str.length());
	System.out.println(str.charAt(3));
	System.out.println(str.codePointAt(3));
	
	System.out.println(str.codePointBefore(10));
	//compare TO
	System.out.println(str.compareTo(str3));//0
	System.out.println(str.compareTo(str1));//32 (104(h ascii value)-72(H ascii value))
	System.out.println(str1.compareTo(str2));//-12(109(m ascii value)-121(y ascii value))
	
	//compareTo ignore case
	System.out.println(str.compareToIgnoreCase(str1));//0
	char c='\n';
	System.out.println((int)c);
	
	//replace
	String str5 = "Java123is456fun";

    // regex for sequence of digits
    String regex = "\\d+";

    // replace all occurrences of numeric
    // digits by a space
    System.out.println(str5.replaceAll(regex, " "));//Java is fun
    System.out.println(str5.replace("\\d+", " "));//Java123is456fun(y its not giving me the same result as of the replaceall)
    
    String str6="Learn   Java easily";
    System.out.println(str6.replaceAll("\\s+", "x"));
    System.out.println("---------------");
    //substring
    System.out.println(str5.substring(2));//va123is456fun
    System.out.println(str5.substring(2,6));//val12(startindex,endindex-1)
    System.out.println(str5.subSequence(2, 6));
	
		
	}

}
