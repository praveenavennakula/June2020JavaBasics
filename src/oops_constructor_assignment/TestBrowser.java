package oops_constructor_assignment;

public class TestBrowser {

	public static void main(String[] args) {
       
		String[] plugin= {"TestNG","Cucumber"};
		
		Browser b=new Browser("naveen", 12.3, plugin);
		System.out.println("Name is :"+b.getName());
		String[] plug1=b.getPlugin();
		System.out.println("plugins are:"+plug1.length);
		for(String e:plug1) {
			System.out.println(e);
			
		}
		System.out.println("Version is: "+b.getVersion());
System.out.println("------------------------------");		
		b.setName("shanvitha");
		b.setVersion(1.23);
		String[] plug2={"mytest1","myset2"};
		b.setPlugin(plug2);
		System.out.println("Name is :"+b.getName());
		plug2=b.getPlugin();
		System.out.println("plugins are:"+plug2.length);
		for(String e:plug2) {
			System.out.println(e);
			
		}
		System.out.println("Version is: "+b.getVersion());
		
	}

}
