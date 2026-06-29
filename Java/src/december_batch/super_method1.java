package december_batch;
class test9 {
	test9(int n){
		System.out.println("test7 "+ n);
	}
	
}

class test8 extends test9{
	test8(){
		super(2);
		System.out.println("test8");
	}
	
}
public class super_method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
test8 t = new test8();
	}

}
