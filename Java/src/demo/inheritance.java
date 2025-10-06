package demo;


	

class A1{
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
		b.get1();
		b.get2();
		
		
	}

}
