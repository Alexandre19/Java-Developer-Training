package com.account;

import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {

		public static void main(String[] args) {
			
			
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			
			System.out.println("Please enter the your name");
			String name = scanner.next();
			
			System.out.println("Please enter the last name");
			String lastName = scanner.next();
			
			System.out.println("Please enter the Agency number!");
			int account = scanner.nextInt();
			
			System.out.println("Please inform your bank branch");
			String branch = scanner.next();
			
			System.out.println("Inform your Bank balance");
			double balance = scanner.nextDouble();
			
			System.out.println("Hello " + name + " " + lastName + " thank you for creating an account in our bank, your branch is " 
			+ branch + " account " + account + " and your balance " + balance + " is now available for withdrawal");
			
			scanner.close();
	}

}
