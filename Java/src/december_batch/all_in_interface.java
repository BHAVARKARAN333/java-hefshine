package december_batch;

public class all_in_interface implements dec1, dec2, dec3 {

	public static void main(String[] args) {
		all_in_interface ob = new all_in_interface();
		ob.first();
		ob.second();
		ob.third();

	}

	@Override
	public void third() {
		// TODO Auto-generated method stub
		System.out.println("third");
		
	}

	@Override
	public void second() {
		// TODO Auto-generated method stub
		System.out.println("second");
	}

	@Override
	public void first() {
		// TODO Auto-generated method stub
		System.out.println("first");
	}

}
