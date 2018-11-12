package training;

public class Sumofno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		n=n+2;
		System.out.println(n);
		System.out.println(" ");
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+ " ");
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println(" ");

		//(1+2)+(2+3)+(3+4)
		int result=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			result=result+i+i+1;
		}
		System.out.println(result);
		System.out.println(" ");
		//(1+3)+(2+4)+(3+5)
		int result1=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			result1=result1+i+i+1;
			i++;
		}
		System.out.println(result1);
		System.out.println(" ");
		//(1+1)+(2+4)+(3+9)+(4+16)
		int result2=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			result2=result2+(i*i)+i;
		}
		System.out.println(result2);
		System.out.println(" ");
		int result3=0;
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+" ");
			result3=result3+i*(i+1);
		}
		System.out.println(result3);
	}

}
