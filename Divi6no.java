package training;

public class Divi6no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int no=123456,mod; double result=0,count=0;
				while(no>0)
				{
					if(count==0)
					{
						mod =no%10;
						result=mod;
					}
					else {
						mod=no%10;
						result=result/mod;
					}
					no=no/10;
					count++;
				}
				System.out.println(result);
	}          

}
