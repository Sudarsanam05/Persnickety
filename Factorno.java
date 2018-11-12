package training;

public class Factorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=30;
		int div=x;
		if(x%div==0)
		{
			System.out.println(div);
		}
		div--;
		
		while(div>=1)
		{
			if(x%div==0)
			{
				System.out.println(div);
				break;
			}
			div--;
		}

	}

}
