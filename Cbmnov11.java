package com.oops;

public class Cbmnov11 {
	
	public int dat=100;//global variable or data member
	
	Cbmnov11 obj=new Cbmnov11();//object
	
	void sum2()//method
	{
		int b=4;//local variable because it is created within method and it cannot be called out of method
		System.out.println("sum2" +b);
	}
	
	Cbmnov11()//constructor
	{
		System.out.println("Constructors");
	}
	
	class baby//nested classes
	{
		
	}
	
	public final int ball=129;//constant or global variable

}
