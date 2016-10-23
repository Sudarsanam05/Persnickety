//ix)	Write a simple program as follow concept with java grammar
//			Create a class
//			static method
//			non static method
//			invoke the static and non-static method from the main method


public class Static {
	
	public static void main(String[] ar)
	{
		System.out.println("The use of static and non-static method - Program");
		System.out.println("***********");
		staticdisplay();
		new Static().nonstaticdisp();
	}
	
	static void staticdisplay()
	{
		System.out.println("The static method invoked rightly");
		System.out.println("**********");
	}
	
	void nonstaticdisp()
	{
		System.out.println("The nonstatic method invoked properly");
		System.out.println("************");
	}
}
