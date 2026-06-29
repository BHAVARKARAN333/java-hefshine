package december_batch;

class overriding {
	 static void get() {
		System.out.println("get");
	}
	 static void get(int a) {
			System.out.println("get1");
		}
	
}



public class static_overrding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overriding.get(2);
		overriding.get();
		

	}

}
