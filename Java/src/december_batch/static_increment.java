package december_batch;

class outer{
	void display() {
		
		inner ob = new inner();
		ob.show();
		
	}
	
	  class inner{
		void show() {
			System.out.println("i am ineer class");
		}
	}
}
public class static_increment {
	
	

	public static void main(String[] args) {
		
		outer ob = new outer();
		ob.display();
		
		outer.inner ob2 =ob.new inner();
		ob2.show();
				
				
	}

}
