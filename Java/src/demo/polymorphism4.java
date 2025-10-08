package demo;

class poly1{
	
	void poly() {
		System.out.println("poly ");
	}
	void poly(int a) {
		System.out.println("poly1 "+a);
	}
	void poly(byte b) {
		System.out.println("poly "+b);
	}
	
	void poly(int a, int b) {
		
		
	}
}


public class polymorphism4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		poly1 p = new poly1();
		
		p.poly();
		p.poly((byte)5);
		// byte int 
		
		
		
		
		
	}

}
