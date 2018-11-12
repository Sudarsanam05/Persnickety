package pattern;

public class Floyd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//123 123 123
		
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=3;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		//111 222 333
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=3;col++)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1 12 123
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1 22 333
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1 2 33
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=row;col+=2)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 12 1
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col+" ");
			}
		System.out.println(" ");
		}
		System.out.println(" ");
		
		//321 32 3
		for(int row=1;row<=3;row++)
		{
			for(int col=3;col>=row;col--)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 23 3
		for(int row=1;row<=3;row++)
		{
			for(int col=row;col<=3;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 45 6
		int i=1;
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(i +" ");
				i++;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1234 567 89 10
		int j=1;
		for(int row=4;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(j +" ");
				j++;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//654 32 1
		int k=6;
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(k +" ");
				k--;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1 12 123
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1 22 333
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//3 32 321
		for(int row=3;row>=1;row--)
		{
			for(int col=3;col>=row;col--)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//3 22 111
		for(int row=3;row>=1;row--)
		{
			for(int col=3;col>=row;col--)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//111 22 3
		for(int row=1;row<=3;row++)
		{
			for(int col=3;col>=row;col--)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 12 1
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//321 32 3
		
		for(int row=1;row<=3;row++)
		{
			for(int col=3;col>=row;col--)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//333 22 1
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
	//**1 *1 1
		for(int row=1;row<=3;row++)
		{
			for(int col=2;col>=row;col--)
			{
				System.out.print("*" +" ");
			}
			System.out.print("1");
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//1 -2 --3
		for(int row=1;row<=3;row++)
		{
			for(int col=2;col>=row;col--)
			{
				System.out.print(" ");
			}
			System.out.print(row);
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//--1 -22 333
		for(int row=1;row<=3;row++)
		{
			for(int col=2;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=row;l++)
			{
				System.out.print(row +" ");
			}
		System.out.println(" ");
		}
		System.out.println(" ");
		
		//2 33 111
		for(int row=1;row<=3;row++)
		{
			int col2 = 1;
			for(int col=2;col>=row;col--)
			{
				System.out.print(" ");
				col2=col+1;
			}
			for(int m=1;m<=row;m++)
			{
				System.out.print(col2);
			}
			System.out.println(" ");
		}
		
		// 3 32 321
		for(int row=3;row>=1;row--)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print(" ");
			}
			for(int h=3;h>=row;h--)
			{
				System.out.print(h);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 456 789
		int g=1;
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<=3;col++)
			{
				System.out.print(g +" ");
				g++;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		// 123 456 789
		int f=1;
		for(int row=1;row<=9;row++)
		{
			System.out.print(f +" ");
			if(f%3==0)
			{
				System.out.println(" ");
			}
			f++;
		}
		System.out.println(" ");
		
		//ABC DEF GHI
		int s=1;
		for(int row=1;row<=9;row++)
		{
			System.out.print((char)(s+64) +" ");
			if(s%3==0)
			{
				System.out.println(" ");
			}
			s++;
		}
		System.out.println(" ");
		
		//1 -2 --3
		for(int row=1;row<=3;row++)
		{
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			for(int col=row;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 12 1
		for(int row=3;row>=1;row--)
		{
			for(int space=3;space>row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print(col +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//**1 *22 333
		for(int row=1;row<=3;row++)
		{
			for(int col=2;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int d=1;d<=row;d++)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		
		//**3 *22 111
		for(int row=3;row>=1;row--)
		{
			for(int col=2;col<=row;col++)
			{
				System.out.print(" ");
			}
			for(int w=3;w>=row;w--)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//**1 *23 456
		int e=1;
		for(int row=1;row<=3;row++)
		{
			for(int col=2;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int h=1;h<=row;h++)
			{
				System.out.print(e +" ");
				e++;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//**6 *54 321
		int q=1;
		for(int row=1;row<=3;row++)
		{
			for(int col=2;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int h=1;h<=row;h++)
			{
				System.out.print(q +" ");
				q--;
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 12 1
		for(int row=3;row>=1;row--)
		{
			for(int col=3;col>row;col--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=row;c++)
			{
				System.out.print(c +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//123 23 3
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(" ");
			}
			for(int c=row;c<=3;c++)
			{
				System.out.print(c +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//321 32 3
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(" ");
			}
			for(int c=3;c>=row;c--)
			{
				System.out.print(c +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//321 21 1
		for(int row=3;row>=1;row--)
		{
			for(int col=3;col>row;col--)
			{
				System.out.print(" ");
			}
			for(int c=row;c>=1;c--)
			{
				System.out.print(c +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//333 22 1
		for(int row=3;row>=1;row--)
		{
			for(int col=3;col>row;col--)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=row;c++)
			{
				System.out.print(row +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		
		//111 22 3
		for(int row=1;row<=3;row++)
		{
			for(int col=1;col<row;col++)
			{
				System.out.print(" ");
			}
			for(int c=row;c<=3;c++)
			{
				System.out.print(c +" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}

}
