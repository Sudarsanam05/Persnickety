package firstwork;

import java.util.Scanner;

public class Salarynew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bpay, hra,da,esi,pf;
		double gpay,npay,apay;
		System.out.println("Payslip");
		System.out.println("----------");
		Scanner in=new Scanner(System.in);
		System.out.print("Basic pay:");
		bpay=in.nextFloat();
		hra=(bpay)*0.03;
		System.out.println("HRA:" +hra);
		da=(bpay)*0.02;
		System.out.println("DA:" +da);
		pf=(bpay)*0.01;
		System.out.println("PF:" +pf);
		esi=(bpay)*0.01;
		System.out.println("ESI:" +esi);
		gpay=bpay+hra+da+esi+pf;
		System.out.println("Gross pay:" +gpay);
		npay=gpay-(pf+esi);
		System.out.println("Net pay:" +npay);
		in.close();
		apay=gpay*12;
		System.out.println("Annual pay:" +apay);
	}

}
