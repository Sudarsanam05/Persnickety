//iv)	Write a simple program as follow concept with java grammar
//Print the word - number of time given by the user input number using  FOR, WHILE

import java.util.Scanner;


public class Repeatedname {
	
	public static void main(String args[])
	{
		int g,h,m=0;
		String s;
		System.out.println("Enter the Word:");
		Scanner x=new Scanner(System.in);
		s=x.next();
		System.out.println("Enter the number of times the word need to be printed in for loop:");
		g=x.nextInt();
		for(int i=0;i<g;i++)
		{
			System.out.println("The Word is: " +s);
		}
		System.out.println("Enter the number of times the word need to be printed in while loop:");
		h=x.nextInt();
		while(m<h)
		{
			System.out.println("The word is:" +s);
			m++;
		}
		x.close();
	}

}
