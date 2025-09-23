package demo;

class Test {
	int a =10;
	float b = 20.67f;
	double c = 30.9876;
	String d = "karan";
	char ch = 'k';
	
}
public class oop {
	public static void main(String args[]) {
		
		
		Test tt = new Test();
		
		//test -> class name
		//tt -> add of object 
		//new -> creates new object and stored in heap area
		// Test() -> default constructor 
		
		System.out.println(tt.a);
		System.out.println(tt.b);
		System.out.println(tt.c);
		System.out.println(tt.d);
		System.out.println(tt.ch);
		
	}

}
