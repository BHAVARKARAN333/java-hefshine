package december_batch;

class karan {
	
void run() {
	System.out.println("karan");
}
}

class karn extends karan{
	void run1() {
		System.out.println("karn");
	}
}

public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		karan b = new karn();
		b.run();
		
		
		
		karan c = new karan();
		c.run();

	}

}
