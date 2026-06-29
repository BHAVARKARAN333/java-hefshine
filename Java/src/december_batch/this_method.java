package december_batch;

class test6 {
	void get(){
		System.out.println("get");
	}
	void set(){
		this.get();
		System.out.println("set");
	}
	void display(){
		set();
		System.out.println("display");
	}
}

class test7 extends test6{
	void get() {
		super.get();
		System.out.println("hello");
	}
}

public class this_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test7 t = new test7();
		t.get();
	}

}
