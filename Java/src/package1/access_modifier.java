package package1;

class parent{
	
	 int x = 28;
	
	 void display() {
		//System.out.println(x);
		System.out.println("hello");
	}
	
	parent(){
		System.out.println(x);
	}
}

class child extends parent{
	
	void show() {
		System.out.println(x);
	}
	
}
public class access_modifier extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent ob = new parent();
		//ob.display();
		
		//child ob1 = new child();
		//ob1.display();
		//ob1.show();

	}

}
