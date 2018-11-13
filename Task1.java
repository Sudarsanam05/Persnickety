package com.oops;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name,initial,email;
		int age;
		long mobile,phone;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the initial of your name:");
		initial=sc.next();
		System.out.println("Enter the age:");
		age=sc.nextInt();
		System.out.println("Enter the mobile number:");
		mobile=sc.nextLong();
		System.out.println("Enter the phone number:");
		phone=sc.nextLong();
		System.out.println("Enter the email id:");
		email=sc.next();
		System.out.println("---------------------------------------");
		System.out.println("| " +"Name: " +name +"\t"+"\t"+"    "+" |");
		System.out.println("| " +"Initial: " +initial +"\t"+"\t"+"\t"+"    "+" |");
		System.out.println("| " +"Full name: " +initial +"." +name +"\t"+"    "+" |");
		System.out.println("| " +"Age: " +age +"\t"+"\t"+"\t"+"    "+" |");
		System.out.println("| " +"Mobile number: " +mobile +"\t"+"    "+" |");
		System.out.println("| " +"Phone number: " +phone +"\t"+"\t"+"    "+" |");
		System.out.println("| " +"Email id: " +email +"\t" +"    "+" |");
		System.out.println("----------------------------------------");
		sc.close();
		

	}

}
