package demo;


class karanb{
	void get() {
		System.out.println("get");
	}
}

class karan1 extends karanb{
	void get0() {
		System.out.println("get4");
	
}
}
class karan2 extends karan1{
	void get1() {
		System.out.println("get1");
	}
}



class karan3 extends karan2{
	void get2() {
		System.out.println("get2");
	}
}

class karan4 extends karan2{
	void get3() {
		System.out.println("get3");
	}
}



























class aa {
	void get0(int a) {
		System.out.println(a);
	}
}

class bb {
	aa a2 = new aa();
	void get() {
		System.out.println("get");
	}
}


class cc {
	bb a1 = new bb();
	void get1() {
		System.out.println("get1");
	}
}
public class hierarchical_multilevel {

	public static void main(String[] args) {
		
	
	
		
		cc c1 = new cc();
		c1.a1.a2.get0(2);
		c1.a1.get();
		c1.get1();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		karan3 dd = new karan3();
//		dd.get();
//		dd.get0();
//		dd.get1();
//		dd.get2();
//
//		karan4 k1 =new karan4();
//		
//		k1.get();
//		k1.get0();
//		k1.get1();
//		k1.get3();
		
		
	}}
