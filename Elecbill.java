package firstwork;

import java.util.Scanner;

public class Elecbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cmr,lmr;
		double unit,amt;
		Scanner in=new Scanner(System.in);
		System.out.println("Tamilnadu Electricity bill");
		System.out.println("------------------------------");
		System.out.print("CMR:");
		cmr=in.nextFloat();
		System.out.print("LMR:");
		lmr=in.nextFloat();
		unit=cmr-lmr;
		System.out.print("Unit:" +unit);
		System.out.println(" ");
		if(unit<=100)
		{
			System.out.println("No need to pay Ebill");
		}
		else
		{
			amt=unit*6;
			System.out.println("Amount:" +amt);
		}
		in.close();

	}

}
