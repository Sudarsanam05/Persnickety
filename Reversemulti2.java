package training;

public class Reversemulti2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16,diff=16;
		while(n>=1)
		{
			System.out.print(n +" ");
			n=n/2;
			diff=diff-n;
			System.out.println(diff);
		}
		

	}

}
