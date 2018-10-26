package training;

public class Multidiv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,count=0;
		while(n<=40)
		{
			if(n%4==0)
			{
				System.out.print(n +" ");
				count=count+1;
			}
			n++;			
		}
		System.out.println(" ");
		System.out.println("Count is:" +count);
		
		int y=1,count1=0;
		while(count1<5)
		{
			if(y%4==0)
			{
				System.out.print(y +" ");
				count1=count1+1;
			}
			y=y*2;
		}
		System.out.println(" ");
		System.out.print(count1);

	}

}
