package training;

public class Numberof5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=25;
		n=n/5;
		System.out.println(n);
		
		int y=25,count=0;
		while(y>=5)
		{
			y=y-5;
			count=count+1;
		}
		System.out.println("count:" +count);
		
		int z=25,count1=0, x=0;
		while(x<=z)
		{
			x=x+5;
			count1=count1+1;
		}
		System.out.println("count:" +count1);
		
		int w=1,count2=0,s=25;
		while(w<=s)
		{
			w=w*5;
			count2=count2+1;
			w=count2;
			w++;
		}
		System.out.println(count2);
	}

}
