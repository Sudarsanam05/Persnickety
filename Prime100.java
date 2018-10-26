package training;

public class Prime100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		System.out.println("Prime numbers from 1 to 100:");
		while(n<=100)
		{
			if((n==2)||(n==3)||(n==5)||(n==7))
			{
				System.out.print(n +" ");
				
			}
			if((n%2!=0)&&(n%3!=0)&&(n%5!=0)&&(n%7!=0))
			{
				System.out.print(n +" ");
			}
			n++;
		}

	}

}
