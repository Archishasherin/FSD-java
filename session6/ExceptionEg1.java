package session6;

public class ExceptionEg1 {
	String str1 = "Hello";
	public void name() {
		try {
			int i = Integer.parseInt(str1);
			System.out.println("the value of converted string:"+str1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
			
		
	}
	public static void main(String[] args) {
		ExceptionEg1 ee = new ExceptionEg1();
		ee.name();
	}

}
