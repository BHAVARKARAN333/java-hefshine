package december_batch;

abstract class demo1{
	abstract void show();
	void get()
	{
		System.out.println("get");
	}
	
	demo1(){
		System.out.println("get1");
	}
	
	static void sample() {
		System.out.println("sample");
	}
}


class demo2 extends demo1{
	void show() {
		System.out.println("show");
	}
}

public class jan_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo2 d = new demo2();
		d.get();
		d.show();
		demo1.sample();
	}

}
