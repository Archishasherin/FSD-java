package session3;

public class Arrayeg {
	public static void main(String[] args) {
		int i = 1;
		while(i<10) {
			if(i==5) {
				break;//continue
			}
			System.out.println(i);
			i++;
			String[] names = {"sachin","virat","dhoni"};
			for(int a = 0; a<names.length; a++) {
				System.out.println(names[i]);
			}
		}
	
	}

}
