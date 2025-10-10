package demo;

abstract class test12{
	abstract void show();
	void get()
{
		System.out.println("get");}
}

class test13 extends test12{
	void display() {
		System.out.println("display");
	}
	
	void show() {
		System.out.println("show");
	}
}

public class abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test13 t1 = new test13();
		t1.get();
		t1.display();
		t1.show();
	}

}
