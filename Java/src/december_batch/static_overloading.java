package december_batch;
class loading{
	
	static void get(){
		System.out.println("get");
	}
}

class loading1 extends loading{
	
	static void get() {
		System.out.println("get1");
	}
}

public class static_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		loading.get();
		loading1.get();
	}

}
