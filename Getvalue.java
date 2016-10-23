//iii)	Write a simple program as follow concept with java grammar
//Get the input from the user and store in the variable of all datatype.
//Print that value 

import java.util.Scanner;


public class Getvalue {
	
	public static void main(String args[])
	{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the value of byte datatype: ");
		byte a= x.nextByte();
		System.out.println("Enter the value of short datatype: ");
		short b=x.nextShort();
		System.out.println("Enter the value of integer datatype: ");
		int c=x.nextInt();
		System.out.println("Enter the value of float datatype: ");
		float d=x.nextInt();
		System.out.println("Enter the value of double datatype: ");
		double e=x.nextDouble();
		System.out.println("Enter the value of long datatype: ");
		long f=x.nextLong();
		System.out.println("Enter the value of char datatype: ");
		char g=x.next().charAt(0);
		System.out.println("Enter the value of String datatype: ");
		String h=x.next();
		System.out.println("Enter the value of boolean datatype: ");
		boolean i=x.nextBoolean();
		System.out.println("The value of byte datatype: " +a);
		System.out.println("The value of short datatype: " +b);
		System.out.println("The value of integer datatype: " +c);
		System.out.println("The value of float datatype: " +d);
		System.out.println("The value of double datatype: " +e);
		System.out.println("The value of long datatype: " +f);
		System.out.println("The value of char datatype: " +g);
		System.out.println("The value of String datatype: " +h);
		System.out.println("The value of boolean datatype: " +i);
		x.close();
	}
	
}
