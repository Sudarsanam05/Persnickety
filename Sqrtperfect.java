package training;

public class Sqrtperfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=49,div=n/2;
		while(div>2)
		{
			if(n/div == div)
			{
				System.out.println("Sqrt:" +div);
				break;
			}
			div--;
		}

	}

}
