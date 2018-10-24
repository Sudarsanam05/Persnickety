package training;

public class Divisible3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=100)
		{
			if(n%3==0)
			{
				if(n%5==0)
				{
					System.out.print(n +" ");
				}
			}
			n++;
		}

	}

}
