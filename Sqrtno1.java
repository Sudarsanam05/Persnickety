package training;

public class Sqrtno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=36,g2;
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

	}

}
