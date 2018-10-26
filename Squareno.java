package training;

public class Squareno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1,count=0;
		while(n<=5)
		{
			n=n*n;
			System.out.print(n +" ");
			count=count+1;
			n=n/count;
			n++;
		}
		
		int y=1,count1=0;
		System.out.println(" ");
		while(y<=5)
		{
			y=y*y;
			System.out.print(y +" ");
			count1=count1+1;
			y=count1;
			y++;
		}
		
		int z=1,count2=0,diff=0;
		System.out.println(" ");
		while(z<=5)
		{
			z=z*z;
			/*System.out.print(z +" ");*/
			if(z!=1) {
			diff=z-diff;
			System.out.print("diff:" +diff +" ");}
			diff=z;
			count2=count2+1;
			z=count2;
			z++;
		}

	}

}
