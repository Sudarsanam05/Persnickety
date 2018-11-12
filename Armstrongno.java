package training;

public class Armstrongno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,result=0;
		while(n>0)
		{
			int mod=n%10;
			result=result+(mod*mod*mod);
			n=n/10;
		}
		if(result==n)
		{
		System.out.println(result +" is an armstrong number");

	}
		else
		{
			System.out.println(result +" is not an armstrong number");
		}
	}
}
