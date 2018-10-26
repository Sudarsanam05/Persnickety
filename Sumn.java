package training;

public class Sumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,count=0,sum=0;
		while(count<5)
		{
			if(n%4==0)
			{
				System.out.print(n +" ");
				sum=sum+n;
				count=count+1;
			}
			n=n*2;
		}
		System.out.println(" ");
		System.out.println("Count:" +count);
		System.out.println("Sum:" +sum);

	}

}
