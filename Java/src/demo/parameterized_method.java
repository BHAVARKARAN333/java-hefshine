package demo;
class jaydeep{
	void m1(float a) {
		System.out.println(a);
	}
	
	void m2(int a, String b) {
		System.out.println(a+" "+b);
	}
	
	void m3(double a, int b) {
		System.out.println(a+" "+b);
	}
	
	static void get() {
		System.out.println("Static");
	}
	
}

public class parameterized_method {
	public static void main(String args []) {
		
//		jaydeep t1 = new jaydeep();
//		
//		t1.m1(1.5f);
//		t1.m2(2, "karan");
//		t1.m3(3.5, 3);
		
		jaydeep.get();
}
}





