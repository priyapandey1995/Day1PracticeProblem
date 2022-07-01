package demo;

public class StaticDemo {
	//about static variables,methods,and block
	/*static variables:can be accessed directly or by using class name.
	 * static methods:can be accessed directly or by using class name.
	 * static block:it executes by default if there is single reference to a class.
	 * 				need not be called explicilitly.
	 */
   static int i=10;
   static int x=20;
   static void display() {
	   int sum=0;
	   sum = 10 + 20;
	   System.out.println("display static method");
	   System.out.println("the sum is" + sum);
   }
   
   static {
	   System.out.println("static block");
   }
	

	public static void main(String[] args) {
		System.out.println("print static variable ="+ " " + i);
		System.out.println("print static variable ="+ " " + x);
		display();//can be accessed directly
	}

}
