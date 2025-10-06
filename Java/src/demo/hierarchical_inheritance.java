package demo;
class Bank{
	void v3() {
		System.out.println("bank");
	}
}

class HDFC extends Bank{
	void v4() {
		System.out.println("hdfc");
	}
}

class SBI extends Bank{
	void v5() {
		System.out.println("sbi");
	}
}

public class hierarchical_inheritance {
	public static void main(String args[]) {
		
		HDFC a = new HDFC();
		a.v3();
		a.v4();
		
		SBI b = new SBI();
		b.v3();
		b.v5();
		
	}

}
