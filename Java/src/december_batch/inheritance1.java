package december_batch;

class a {
	
	void set() {
		System.out.println("set");
	}
}

class b  extends a{
	void get() {
		System.out.println("get");
	}
}

class c  extends b{
	void main() {
	
		System.out.println("main");
	}
}

public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c s1 = new c();
		
		s1.set();
		s1.get();
		s1.main();

	}

}
