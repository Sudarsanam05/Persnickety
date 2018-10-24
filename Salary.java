package firstwork;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=2455000;
		if(salary<250000) {System.out.println("You have to pay to no income tax");}
		else if(salary<500000) {System.out.println("You have to pay 5%tax");}
		else if(salary<1000000) {System.out.println("You have to pay 10%tax");}
		else if(salary<2000000) {System.out.println("You have to pay 20%tax");}
		else {System.out.println("You have to pay 30%tax");}

	}

}
