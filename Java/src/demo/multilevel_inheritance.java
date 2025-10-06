package demo;

class A {
	void get() {
		System.out.println("first");
	}
}

class B1 extends A{
	void get1() {
		System.out.println("second");
	}
}

class B2 extends B1 {
	void get2() {
		System.out.println("third");
	}
}

public class multilevel_inheritance {
public static void main(String args[]) {
		
		B2 b = new B2();
		b.get();
		b.get1();
		b.get2();
		
		
	}

}
