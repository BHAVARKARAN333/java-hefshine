package demo;
class hefshine{
	static void get() { // static method
	}
	
	
	void show() { //method
		System.out.println("show");
	}
	
	
	static {  // static block 
		System.out.println("karan");
	}
}
public class static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hefshine t1= new hefshine();
		t1.show();
		hefshine.get();
		

	}

}
