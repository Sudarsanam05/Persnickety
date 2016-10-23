import java.util.Scanner;


public class Menu {
	
	public static void main(String[] ar)
	{
		int n;
		String s;
		System.out.println("The menu items are : ");
		System.out.println("1. JAVA" + "\n" +" 2. ANDROID" +"\n" +" 3.DOTNET");
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter your choice: ");
		n=sc.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Your choice is: 1. JAVA");
			break;
		case 2:
			System.out.println("Your choice is: 2. ANDROID");
			break;
		case 3:
			System.out.println("Your choice is: 3. DOTNET");
			break;
		default:
			System.out.println("Your entered choice is wrong");
			break;
			
		}
		
		System.out.println("Do you want to continue (yes or no) : ");
		s=sc.next();
		}while(s.equals("yes"));
		sc.close();
	}

}
