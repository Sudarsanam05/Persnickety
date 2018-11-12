package com.oops;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				if(count%2==0)
				{
					System.out.print("*" +" ");
				}
				
				else {
					System.out.print("$" +" ");
				}
			}
			count++;
			System.out.println(" ");
		}
		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				if(row%2==0)
				{
					System.out.print("$"+" ");
					
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println(" ");
		}

	}

}
