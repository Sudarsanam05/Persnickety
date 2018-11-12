package training;

public class Primeoddplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		for(int i=1;i<=20;i++)
		{
			if(i==2 || i==3 || i==5 || i==7)
			{
				System.out.print(i + " ");
			}
			
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
			{
				System.out.print(i + " ");
				  
			}
			/*if(count%2==0)
			{
				System.out.println(i);
				System.out.println("-----");
			}
			count++;*/
		}
		
		System.out.println(" ");
		
			for(int i=1;i<=20;i++)
			{
			
				if(count%2!=0)
				{
				if(i==2 || i==3 || i==5 || i==7)
				{
					System.out.print(i + " ");
				}
				
				if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
				{
					System.out.print(i + " ");
					  
				}
				/*if(count%2==0)
				{
					System.out.println(i);
					System.out.println("-----");
				}
				count++;*/
				
					
			}
				count++;
		}
		

	}

}
