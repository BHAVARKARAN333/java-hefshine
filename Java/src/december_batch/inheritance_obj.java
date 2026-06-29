package december_batch;
class test66{
	test66(){
		System.out.println("get");
	}
}

class test88 extends test66{
	test88(){
		System.out.println("set");
	}
}

class test77 extends test88{
	test77(){
		System.out.println("set1");
	}
}
public class inheritance_obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test77 s1 = new test77();
		
		

	}

}
