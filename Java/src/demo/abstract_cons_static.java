package demo;

abstract class test16{     

	abstract void show();
	test16(){
		System.out.println("karan");
	}

	static void add() {
		System.out.println("add");
	}
	void get()             
	{
		System.out.println("get");}
}

class test15 extends test16{    


	void show() {                  
		System.out.println("show");        
	}


}

public class abstract_cons_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test15 t1 = new test15();
		t1.get();
		t1.show();
		test16.add();

	}

}
