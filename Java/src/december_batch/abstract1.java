package december_batch;

// class extends class
// class implements interface
// interface extends interface

interface one {
	void show();
	}

interface one1 extends one{
	void show1();
}

interface one2 extends one1{
	void show2();
}

class two implements  one2{
	
	public void show() {
		System.out.println("show");
		
		}
	public void show1() {
		System.out.println("show1");
		
		}
	public void show2() {
		System.out.println("show2");
		
		}
	
//	two(){
//		System.out.println("karan");
//	}
//	
//	static void main() {
//		System.out.println("bhavar");
//	}
	
	
}
public class abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		two ob = new two();
		ob.show();
		ob.show1();
		ob.show2();
		
		
	}

}
