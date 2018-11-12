package training;

public class HCFno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int m=36,g2;
		int g1=m/2;
		while(true)
		{
			if((m/g1)==g1)
			{
				System.out.println(g1);
				break;
			}
			g2=(g1+(m/g1))/2;
			g1=g2;
		}
		*/

		int no1=30,no2=18;
		int big=no1>no2?no1:no2;
		int small=no1<no2?no1:no2;
		if(big%small==0)
		{
			System.out.println(small);
		}
		else
		{
			int rem=big%small;
			do {
				
				if(big%rem==0 && small%rem==0)
				{
					System.out.println(rem);
					break;
				}
				big=small;
				small=rem;
			}while(rem>0);
		}
	}

}
