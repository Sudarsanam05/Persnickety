package training;

public class Div2or3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		while(x<=10)
		{
			if((x%2==0)||(x%3==0))
			{
				System.out.println(x);
			}
			/*else
			{
				if(x%3==0)
				{
					System.out.print(x +"Divisible by 3");
				}
			}*/
			x++;
		}

	}

}
