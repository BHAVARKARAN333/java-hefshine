package december_batch;

class a {
	void set() {
		System.out.println("set");
	}
}

class b {
	void get() {
		System.out.println("get");
	}
}

class c extends a extends b {

}

public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		a s1 = new a();
		s1.set();
		
		b s2 = new b();
		s2.get();
		
		c s3 = new c()
	}

}
