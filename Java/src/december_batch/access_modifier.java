package december_batch;
class base {
	private int x;
	base(int y){
		x=y;
	}
	void display() {
		System.out.println(x);
	}
}

class derived extends base{
	
}

public class access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		base b1 = new base(2);
		b1.display();

	}

}
