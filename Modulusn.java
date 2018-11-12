package training;

public class Modulusn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		while(n>0)
		{
			int mod=n%10;
			System.out.print(mod);
			n=n/10;
		}
		
		System.out.println(" ");
		int y=123456;
		while(y>0)
		{
			int mod=y%10;
			System.out.print(mod);
			y=y/10;
		}
		
		System.out.println(" ");
		int z=123,result=0;
		while(z>0)
		{
			int mod1=z%10;
			result=(result*10)+mod1;
			z=z/10;
		}
		System.out.println(result);
		if(result==z)
		{
			System.out.println("Both numbers are same");
		}
		
		System.out.println(" ");
		int x=123456,result1=0;
		while(x>0)
		{
			/*int mod1=x%100;*/
			int mod2=x%1000;
			result1=(result1*1000)+mod2;
			x=x/1000;
		}
		System.out.println(result1);

	}

}
