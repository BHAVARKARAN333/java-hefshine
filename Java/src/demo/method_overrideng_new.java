package demo;


class method2 {
	
	static void get() {
		System.out.println("first");
	}
	
	}

class method1 extends method2{
	
	static void get()
	{
		System.out.println("second");
	}
	
}
public class method_overrideng_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		// static overriding is not possible because method call by using class name 
		// overriding work on a object but in static method no required to make object for access method 
		// overloading is possible 
		
		
		method2.get();
		method1.get();

	}

}
