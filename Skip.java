import java.util.Scanner;

public  class Skip{
	public static void main(String args[])
	{
		int a,n;
		String s;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Enter the number of times to be executed:");
		a=sc.nextInt();
		System.out.println("Enter the number needed to skip:");
		n=sc.nextInt();
		System.out.println("The number series till the end is:");
		for(int i=1;i<=a;i++)
		{
			if(i==n){
				continue;}
			System.out.println(i);
	}
		System.out.println("Do you want to continue (yes or no): ");
		s=sc.next();
		}while(s.equals("yes"));
	sc.close();
		
	}
}