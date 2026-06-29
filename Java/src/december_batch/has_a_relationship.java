package december_batch;

class test1{
	
	void get1() {
		System.out.println("get");
	}
}

class test2{
	
	test1 t = new test1();
	void get2() {
		System.out.println("get2");
	}
	
}

class test3 {
	test2 t1 = new test2();
	void get3() {
		System.out.println("get3");
	}
}

public class has_a_relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test3 s1 = new test3();
		
		s1.get3();
		s1.t1.get2();
		s1.t1.t.get1();
		

	}

}
