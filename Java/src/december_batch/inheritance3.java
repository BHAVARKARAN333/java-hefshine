package december_batch;
class a1{
	void get(){
		System.out.println("get");
	}
}


class b2 extends a1 {
	void get1() {
		System.out.println("get1");
	}
}

class c3 extends b2{
	void get2() {
		System.out.println("get2");
	}
}

class d extends b2{
	void get3() {
		System.out.println("get3");
	}
}
public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		c3 s1 = new c3();
		s1.get();
		s1.get1();
		s1.get2();
		
		d s2 = new d();
		s2.get();
		s2.get1();
		s2.get3();

	}

}
