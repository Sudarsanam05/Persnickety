package training;

public class Gcdno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=30,y=18;
		int divisor=x<y?x:y;
		if(y%divisor==0)
		{
			System.out.println(divisor);
		}
		divisor--;
		while(divisor>1)
		{
			if(x%divisor==0 && y%divisor==0)
			{
				System.out.println(divisor);
				break;
			}
		divisor--;	
		}
		
	}

}
