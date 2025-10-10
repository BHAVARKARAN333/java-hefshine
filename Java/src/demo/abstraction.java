package demo;

abstract class test12{     // can't create abject
	abstract void add();    
	abstract void show();  // abstract method(non method body)
	void get()             // non-abstract method(with method body)
{
		System.out.println("get");}
}

class test13 extends test12{    // child for implementations
	void display() {
		System.out.println("display");
	}
	 
	void show() {                  // body of abstract method
		System.out.println("show");        
	}
	
	void add() {
		System.out.println("add");
	}
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test13 t1 = new test13();
		t1.get();
		t1.display();
		t1.show();
		t1.add();
	}

}
