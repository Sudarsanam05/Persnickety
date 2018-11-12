package training;

public class Nnoforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 to 10
		for(int i=1;i<=10;i++)
		{
			System.out.print(i +" ");
		}
		System.out.println(" ");
		//even no
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i +" ");
			}
		}
		System.out.println(" ");
		for(int i=1;i<=10;i++)
		{
			i++;
			System.out.print(i +" ");
		}
		System.out.println(" ");
		//odd no
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0) {
			System.out.print(i +" ");}
		}
		System.out.println(" ");
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i +" ");
		}
		System.out.println(" ");
		for(int i=1;i<=10;i++)
		{
			System.out.print(i +" ");
			i++;
		}
   System.out.println(" ");
		//2 5 8
		for(int i=1;i<=10;i++)
		{
			i++;
			System.out.print(i +" ");
			i++;
		}
		System.out.println(" ");
		//1*3=3 2*3=6 3*3=9
		
		for(int i=1;i<=5;i++)
		{
			System.out.print(i +" x3 =" +i*3);
			System.out.println(" ");
		}
		System.out.println(" ");
		int i=3;
		while(i<=5)
		{
			for(int row=1;row<=5;row++)
			{
				System.out.print(row +"x" +i +"=" +row*i);
				System.out.println(" ");
			}
			i++;
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int j=3;j<=5;j++)
		{
			for(int row=1;row<=5;row++)
			{
				System.out.print(row +"x" +j +"=" +row*j);
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		//1*4=4 2*4=8 3*4=9
		
		for(int j=1;j<=5;j++)
		{
			System.out.print(j +" x4 =" +j*4);
			System.out.println(" ");
		}
		System.out.println(" ");
		//1*5=5 2*5=10 3*5=15
		
		for(int j=1;j<=5;j++)
		{
			System.out.print(j +" x5 =" +j*5);
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int j=3;j<=5;j++)
		{
			for(int row=1;row<=5;row+=2)
			{
				System.out.print(row +"x" +j +"=" +row*j);
				System.out.println(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		for(int j=3;j<=5;j+=2)
		{
			for(int row=1;row<=5;row++)
			{
				System.out.print(row +"x" +j +"=" +row*j);
				System.out.println(" ");
			}
			System.out.println(" ");
		}
	}

}
