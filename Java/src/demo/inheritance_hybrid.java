package demo;




class demo{
	void get() {
		System.out.println("get");
	}
}

class demo1 extends demo{
	void get1() {
		System.out.println("get1");
	}
}

class demo2 extends demo1{
	void get2() {
		System.out.println("get2");
	}
}

class demo3 extends demo1{
	void get3() {
		System.out.println("get3");
	}
}

public class inheritance_hybrid {
public static void main(String args[]) {
	
	
	
	demo2 d2 = new demo2();
	d2.get();
	d2.get1();
	d2.get2();
	
	System.out.println("\n");
	
	demo3 dd = new demo3();
	dd.get();
	dd.get1();
	dd.get3();
	
}





}
