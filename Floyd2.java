package pattern;

public class Floyd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int row=1;row<=9;row++)
		{
			int space1=1;
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			for(int col=row;col<=9;col++)
			{
				System.out.print(space1);
				space1++;
			}
			System.out.println(" ");
		}
		
		for(int row1=8;row1>=1;row1--)
		{
			int space2=8;
			for(int space3=1;space3>row1;space3++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row1;col++)
			{
				System.out.print(space2);
				space2--;
			}
			System.out.println(" ");
		}
		

	}

}
