package training;

public class Addplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//odd places
		int n=123,result=0;
		while(n>0)
		{
			int mod=n%10;
			result=result+mod;
			n=n/100;
		}
		System.out.println(result);

		//even places
		int y=1234,res=0;
		while(y>0)
		{
			int mod=y%10;
			res=res+mod;
			y=y/100;
		}
		System.out.println(res);
		//odd places
		int z=123456,res1=0;
		while(z>0)
		{
			int mod=z%100;
			mod=mod/10;
			res1=res1+mod;
			z=z/100;
		}
		System.out.println(res1);
		
		
	}

}
