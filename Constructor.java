//x)	Write a simple program as follow concept with java grammar
//	         Create a class
//	         Create an object for the class
//	         parameter and non parameter constructor
//	         Declare the global variable and load the value from the parameter constructor.


public class Constructor {
    static int a;
    public static void main(String[] ar)
    {
    	System.out.println("The use of Constructor method - Program");
    	System.out.println("************");
    	new Constructor();
    	new Constructor(5);
      }
   	Constructor()
    {
    	System.out.println("Hi");
    	a=5;
    	a=a+10;
    	System.out.println("The Constructor with non parameter: "  +a);
    }
    Constructor(int b)
    {
    	System.out.println("The Constructor with parameter is: " +(a+b));
    }
}
