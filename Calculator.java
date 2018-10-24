package firstwork;

//import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator casio=new Calculator();
		//casio is useful for addition
//		casio.add();
		int total=casio.add1();
		System.out.println("Total:"+ total+5);
	}

	private int add1() {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter maths mark:");
//		int maths=scan.nextInt();
//		System.out.println(maths);
		int tamil =50,english=60;
		int total=tamil+english;
//		System.out.println(total);
		return total;
	}

//	private void add() {
//		// TODO Auto-generated method stub
//		int a=5,b=5;
//		int c=a+b;
//		System.out.println(c);
//	}

}
