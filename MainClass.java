package com.oops;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methn12 ob1=new Methn12();
		ob1.add();
		int c=33;
		int z=ob1.sub();
		System.out.println(z+c);
		
		
		int sudersan=ob1.salary(5000, 300, 700, 250);
		System.out.println("salaey of sudersan is "+sudersan);
		
		int jana=ob1.salary(4000, 700, 100, 550);
		System.out.println("salaey of sudersan is "+jana);

	}

}
