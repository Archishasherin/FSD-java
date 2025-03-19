package session3;

public class Nextedloop {
 public static void main(String[] args) {
	for(int i = 1; i<=5; i++) {//initializing
		for(int j = 1; j<=4; j++) {//initializing
			System.out.print(i+""+j);
			
		}
		System.out.println();
		for(int a = 1; a<=5; a++) {
			for(int b = 1; b<a+1; b++) {
				System.out.println(b+" ");
			}
			System.out.println();
		}
	}
}
}
