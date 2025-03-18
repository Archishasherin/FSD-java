package programs;

import java.util.Scanner;

public class Nestedifelse {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("enter ur age:");
	 int age = sc.nextInt();
	 System.out.println("enter ur weight:");
	 int weight = sc.nextInt();
	 
	 if(age>20) {
		 if(weight>50) {
			 System.out.println("age nd weight are satisfied to donate");
			 
		 }else {
			 System.out.println("under weight cannot donate");
		 }
	 }else {
		 System.out.println("age is not satisfied to donate");
	 }
   }
}
