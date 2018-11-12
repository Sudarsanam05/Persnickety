package training;

public class Addeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n=1234,result=0;
		while(n>0)
		{
			int mod=n%10;
			if(mod%2==0)
			{
				result=result+mod;
			}
			n=n/10;
		}
		System.out.println(result);*/
		
		int n=123456,result=0;
		while(n>0)
		{
			int mod=n%100;
			mod=mod%10;
			result=result+mod;
			n=n/100;
		}
		System.out.println(result);
	}

}
