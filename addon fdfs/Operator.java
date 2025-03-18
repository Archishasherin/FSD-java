package programs;

public class Operator {
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		
		//Arithmetic
		System.out.println("addition"+(a+b));
		System.out.println("subtraction"+(a-b));
		System.out.println("multiplication"+(a*b));
		
		
		//relational
		System.out.println("equal to"+(a==b));
		System.out.println("not equal"+(a!=b));
		System.out.println("greater than"+(a>b));
		System.out.println("less than equal to"+(a<=b));
		
		
		//logical
		boolean condition1 = true, condition2 = false;
		
		System.out.println("Logical AND"+(condition1 && condition2));
		System.out.println("Logical OR"+(condition1 || condition2));
		System.out.println("Logical NOT"+(!condition1));
		
		
		//unary
		System.out.println("unary negation"+(~a));
		System.out.println("post increment"+(a++));
		System.out.println("pre increment"+(a++));
		System.out.println("post decrement"+(a--));
		System.out.println("pre decrement"+(a--));
		
		
		
       //Assignment
		a+=5;
		System.out.println("+=:" +a);
		
	
		//ternary ? :
		String res = (a>b)?"a is greater" : "b is greater";
		System.out.println("result:"+res);
		
		
		//bitwise
		/**
		 * AND-->&
		 * oR-->|
		 * not-->~
		 * XOR-->^
		 */
	 

		}
		
	}
