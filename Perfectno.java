package training;

public class Perfectno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=18;
		int div=1,sum=0;
		while(div<=(no/2))
		{
			if(no%div==0)
			{
				sum=sum+div;
			}
			div++;
		}
		System.out.println(sum);
	}

}
