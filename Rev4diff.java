package training;

public class Rev4diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=16;
		while(n>=1)
		{
			System.out.print(n +" ");
			n=n/2;
			
		}
		System.out.println(" ");
		int y=16,diff=16;
		while(y>=1)
		{
			System.out.print(y +" ");
			y=y/2;
			diff=diff-y;
			System.out.print(diff+" ");
		}

	}

}
