package demo;


class sbi{
	 void get() {
		 System.out.println("sbi");
	 }
}

class hdfc{
	 void get() {
		 System.out.println("hdfc");
		 
	 }
}

public class method_overriding {


	public static void main(String args[]) {
	hdfc h1 = new hdfc();
	h1.get();
	h1.get();
}
}
