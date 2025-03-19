package session3;

import java.util.Scanner;

public class Diamondpattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//no of rows by user to give for pattern printing
		System.out.println("enter no of rows");
		int rows = sc.nextInt();
		
		//top half of diamond
		for(int i = 1; i<=rows; i++) {
			//leading space
			for(int j = i; j<rows; j++) {
				System.out.print(" ");
			}
			//print
			for(int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		
		//bottom half of diamond
				for(int i = rows-1; i>=1; i--) {
					//leading space
					for(int j = rows; j>i; j--) {
						System.out.print(" ");
					}
					//print
					for(int k = 1; k<=(2*i-1); k++) {
						System.out.print("*");
					}
					System.out.println();
				}
			
	
	}

}
