//v) Write a simple program as follow concept with java grammar
//Find the greatest and smallest of three numbers given by the user and print it.

import java.util.Scanner;


public class Smallgreat {
	
	public static void main(String[] arg)
	{
		long a,b,c;
		String s;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Enter the first number:");
		a=sc.nextLong();
		System.out.println("Enter the second number: ");
		b=sc.nextLong();
		System.out.println("Enter the third number: ");
		c=sc.nextLong();
		if(a<b&&a<c)
		{
			System.out.println("First number " + a + " is the smallest number");
		}
		else{
			if(b<c)
			System.out.println("Second number " +b +" is the smallest number");
			else
			  System.out.println("Third number " +c +" is the smallest number");
		}
		
		if(a>b&&a>c)
		{
			System.out.println("First number " +a +" is the greatest number");
		}
		else{
			if(b>c)
				System.out.println("Second number " +b +" is the greatest number");
			else
				System.out.println("Third number " +c +" is the greatest number");
		}
		System.out.println("Enter your choice (yes or no) : ");
		s=sc.next();
		}while(s.equals("yes"));
		sc.close();
		}
		
	}

