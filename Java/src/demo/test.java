package demo;
class bank{
	
	void deposite() {
		System.out.println("get");
	}
}

class HDFC extends bank {
	void show() {
		System.out.println("show");
}
}
public class test {
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFC s1 = new HDFC();
		s1.show();
		s1.deposite();
		
		

	}

}
