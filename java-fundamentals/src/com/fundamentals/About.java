package com.fundamentals;
import java.util.Locale;
import java.util.Scanner;

public class About {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.println("enter your name");
		String name = scanner.next();
		
		System.out.println("enter your last name");
		String lastName = scanner.next();
		
		System.out.println("enter your age");
		int age = scanner.nextInt();
		
		System.out.println("enter your height");
		Double height = scanner.nextDouble();
		
		System.out.println("Hello, my name is " + name + " " + lastName);
	     System.out.println("I'm " + age + " years old ");
	     System.out.println("my height is " + height + " cm ");
	     
	     scanner.close();
		
		

	}

}
