package com.Application;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Banking App");
		System.out.println("Enter 1 for Saving account and enter 2 for Current account");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int Account = sc.nextInt();
		
		if(Account == 1)
		{
			MMSavingAcc MMSavingAcc = new MMSavingAcc(11, "Kavya", 5000.0f, true);
			MMSavingAcc.withdraw(500f);
			MMSavingAcc.deposite(5000);
			MMSavingAcc.toString();
			
		}
		else if(Account == 2)
		{
			MMCurrentAcc MMCurrentAcc = new MMCurrentAcc(1000, "Veda", 10000f, 500f);
			MMCurrentAcc.withdraw(200f);
			MMCurrentAcc.deposite(10000);
			MMCurrentAcc.toString();
		}
		else
		{
			System.out.println("Input is in correct.  Thank You for visiting.");
		}
		

	}

	

}
