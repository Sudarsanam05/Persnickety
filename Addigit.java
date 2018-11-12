package training;

public class Addigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234,result=0;
		while(n>0)
		{
			int mod=n%10;
			result=result+mod;
			n=n/10;
				
		}
		System.out.println(result);

	}

}
