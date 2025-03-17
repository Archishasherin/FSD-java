package programs;

public class Variables {
int a = 45;
static int b = 50;

public static int print() {
	int mark = 99;
   return mark;
}
 void display(){
	 int d = 78;
	 System.out.println("metyhod inside variable:"+d);
	 }
 public static void main(String[] args) {
	 int c = 65;
	 Variables obj1 = new Variables();
	 System.out.println(obj1.a);
	 obj1.display();
	 System.out.println(b);
	 System.out.println(c);
	 
	 System.out.println(print());
	 Variable2.show();
	 Variable2 v2 = new Variable2();
	 v2.students();
 }
 }
