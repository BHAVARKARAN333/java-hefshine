package demo;

class A {
	void get() {
		System.out.println("get");
	}
}

class A1 extends A{
	void get1() {
		System.out.println("get1");
	}
}

class A2 extends A1 {
	void get2() {
		System.out.println("get2");
	}
}


public class inheritance {
	
	public static void main(String args[]) {
		
		A2 b = new A2();
		b.get();
		b.get1();
		b.get();
		
		
	}

}
