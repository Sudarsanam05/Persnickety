//viii)	Write a simple program as follow concept with java grammar
//          Create a class 
//          method with no return type
//          method with return type
//          parameterized method



public class Method {
	
	public static void main(String[] ar){
		
		System.out.println("The use of method- Program");
		Method ne = new Method();
		ne.noreturn();
		ne.returntype();
		ne.parameter(5);
	}
	
	void noreturn()
	{
		System.out.println("*******");
		System.out.println("noreturn - The method with no return type");
		System.out.println("I am just with void");
		System.out.println("*********");
	}
	
	int returntype()
	{
		System.out.println("returntype - The method with return type");
		System.out.println("I m with return null");
		System.out.println("********");
		return 0;
	}
	int parameter(int a)
	{
		System.out.println("parameter - The method with parameter");
		System.out.println("The parameter passed is: " +a);
		System.out.println("**********");
		return 0;
	}

}
