package december_batch;
class z{
	void get(){
		System.out.println("get");
	}
}


class y extends z {
	void get1() {
		System.out.println("get1");
	}
}

class x extends y {
 void get2() {
	 System.out.println("get2");
 }
}

class w extends x{
	void get3() {
		System.out.println("get3");
	}
}

class v extends x{
	void get4() {
		System.out.println("get4");
	}
}
public class multileve_hirerical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		w s2 = new w();
		s2.get();
		s2.get1();
		s2.get2();
		s2.get3();
		
		System.out.println();
		
		v s3 = new v();
		s3.get();
		s3.get1();
		s3.get2();
		s3.get4();
	}
	
	
}
