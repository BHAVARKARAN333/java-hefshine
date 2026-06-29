package december_batch;

class part{
	 int x = 20;
	 void larm() {
		System.out.println(x);
	}
}

class part1 extends part{
	
	
	void mai() {
		System.out.println();
	}
}

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		part1 ob = new part1();
		ob.larm();
		

	}

}
