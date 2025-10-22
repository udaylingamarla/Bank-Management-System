package com.Bank.service;

import java.util.Random;
import java.util.Scanner;

public class Account {
	
	public static String name;
	public static String gender;
	public static String mob;
	public static int age;
	public static String pan;
	public static int acc_no;

	public void openAccount() {
		System.out.println("Welcome to FinSafe Bank ");
		System.out.println("--------------------------");
		System.out.println("Please provide your details to open your account");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		name = sc.nextLine();
		
		System.out.println("Enter your gender");
		gender = sc.nextLine();
		
		System.out.println("Enter your mobile no");
		mob = sc.nextLine();
		
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter your pan no");
		pan = sc.nextLine();
		
		Random r = new Random();
		acc_no = 1000000 + r.nextInt(8999999);
		System.out.println("Your account has been opened successfully!");
		System.out.println("Welcome: "+name+" | "+"Account number: "+acc_no);
		
		
	}
}
