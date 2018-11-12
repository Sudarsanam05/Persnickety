package training;

public class Reverseno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=12345,result=0,count=0;
		while(no>0)
		{
			int mod =no%100;
			result=result+mod;
			no=no/100; 
		}
			System.out.println("The sum of digits is " +result); 
		while(result>9)
		 {
			
			count=result%10;
			result=result/10;
			count=count+result;
			
			}
		
		System.out.println("count:" +count);
		}

		
		
		
	}


