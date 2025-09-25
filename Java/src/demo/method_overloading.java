package demo;


class test11{
	void get() {
		System.out.println("get");
	}
	void get(int a)
	{
		System.out.println("set");
	}
	void get(float b){
		System.out.println("det");
	}
}


public class method_overloading {

 public static void main(String args[]) {
	 test11 t1 = new test11();
	 
	 t1.get();
	 t1.get(2);
	 t1.get(21.2f);
 }
	
}
