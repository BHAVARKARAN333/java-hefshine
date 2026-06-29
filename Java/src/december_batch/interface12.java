package december_batch;

interface demo04{
	
	public void show(); //abstract method
	
// concrete method
	
	default void get() {
		System.out.println("get");
	}
	
	private void display() {
		System.out.println("display");
	}
	
	static void data() {
		System.out.println("data");
	}
	

}

public class interface12 implements demo04{
	public void show() {
		System.out.println("show");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
interface12 ob = new interface12();
ob.show();
ob.get();
//ob.display();
demo04.data();
		
	}

}
