//v)	Write a simple program as follow concept with java grammar
//Find the user given input is even or odd and print it.

import java.util.Scanner;


public class Oddeven {
	
	public static void main(String[] arg)
	{
		long a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=sc.nextLong();
		if(a%2==0)
		{
			System.out.println(a +" is even number");
		}
		else
		{
			System.out.println(a +" is odd number");
		}
		
		sc.close();
	}

}
