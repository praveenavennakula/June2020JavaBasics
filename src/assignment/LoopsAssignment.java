package assignment;

public class LoopsAssignment {

		
	public static void main(String[] args) {

		// 1. WAP to print following output:
		int i = 1;
		while (i <= 5) {
			System.out.println("I am Batman");
			i++;
		}
		
		System.out.println("-----------------------");
		
		// 2. WAP to print following output:
		for(int j=1;j<10;j++) {
			System.out.println("I am Batman "+j);
			
		}
		System.out.println("-----------------------");
		
		//3. WAP to print 10 to 1 using for, while and do-while loop
		
		//for-loop
		
		for(int j=10;j>=1;j--) {
			System.out.println(j);
			
		}
		
		System.out.println("-----------------------");
		
		//while loop
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		System.out.println("-----------------------");
		
		//do while loop
		int l=10;
		do {
			System.out.println(l);	
			l--;
			
		}while(l>=1);
		System.out.println("-----------------------");
		//4.Write a program in Java to print "Hello World" ten times using while loop
		int m=10;
		while(m>=1) {
			System.out.println("Hello World");
			m--;
		}
		System.out.println("-----------------------");
		
		//5. Write a program in Java to print 1 to 10 using while loop
		int n=1;
		while(n<=10) {
			System.out.println(n);
			n++;
		}
		System.out.println("-----------------------");
		
		//6. WAP to find out the max number from the given positive numbers
		int a=100, b=0, c=30;
		if(a>=b && a>=c) {
			
				System.out.println("Maximum number is "+a);
			
		}
		else if(b>=a && b>=c) {
			
				System.out.println("Maximum number is "+b);
			}
		else {
			
			System.out.println("Maximum number is "+c);	
		}
		System.out.println("-----------------------");
		
		
		//7. print all odd and even numbers between 1 to 100
		
		System.out.println("even numbers between 1 to 100");
		for(int p=1;p<=100;p++) {
			if(p%2==0) {
				System.out.println( p );
			}
			
		}
		System.out.println("odd numbers between 1 to 100");
		for(int p=1;p<=100;p++) {
			if(p%2==1) {
				System.out.println( p);
			}
		}
		System.out.println("-----------------------");
		
		//9. Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.
		
		for (char x='A';x<='Z';x++ ) {
			System.out.println(x+":"+ (int)x);
			
		}
		System.out.println("-----------------------");
		
		for (char x='a';x<='z';x++ ) {
			System.out.println(x+":"+ (int)x);
			
		}
		System.out.println("-----------------------");
		
		for (char x='0';x<='9';x++ ) {
			System.out.println(x+":"+ (int)x);
			
		}
		
		System.out.println("-----------------------");
		//10. Print this series: 
		//1.0 2.0 3.0  ...... 10.0 
		
		for(float j=1;j<=10;j++) {
			System.out.println(j);						
		}
		System.out.println("-----------------------");
		
		//11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		for(int p=1;p<=10;p++) {
			if(p%7==0) {
				System.out.println( p);
				System.out.println("bye, see you tomorrow");
				break;
			}else if(p%7!=0) {
				System.out.println( p);
			}
		}
		
		System.out.println("-----------------------");
		/*
		 * 12. Write a cricket score card system using for and while loops: 
		 * if(score == 0) -- print - "Zero - duck" 
		 * if(score == 25) -- print - "good job" 
		 * if(score == 50) -- print - "good job - half century" 
		 * if(score == 100) -- print -* "good job - century"
		 */
		//for loop
		for(int score=0;score<=100;score++) {
			System.out.println(score);
			if(score == 0) {
			System.out.println("Zero - duck");
			
			}
			if(score == 25) {
				System.out.println("good job");
				
				}
			if(score == 50) {
				System.out.println("good job - half century");
				
				}
			if(score == 100) {
				System.out.println("good job - century");
				
				}
		}
		
		//while loop
		int score=0;
		while(score<=100) {
			System.out.println(score);
			if(score == 0) {
			System.out.println("Zero - duck");
			
			}
			if(score == 25) {
				System.out.println("good job");
				
				}
			if(score == 50) {
				System.out.println("good job - half century");
				
				}
			if(score == 100) {
				System.out.println("good job - century");
				
				}
			score++;
			
		}
		
		System.out.println("-----------------------");
	}


	
	
}
