package programs;

import java.util.Scanner;

public class Conditionalstatemnets {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter your age:");
		int age = sc.nextInt();
		if(age>18) {
			System.out.println("eligible for voting");
	
		}
		else {
			System.out.println("Not eligible for voting");
		}
		
		System.out.println("enter your Age:");
		int Age = sc.nextInt();
		if(age<20) {
			System.out.println("eligible for neet exam");
		}
		else {
			System.out.println("not eligible for neet exam");
		}
	}

}
