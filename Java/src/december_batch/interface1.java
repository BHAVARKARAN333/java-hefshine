package december_batch;
@FunctionalInterface  // when we implement this keyword we can create only one method, 
                         //we can not create two or more methods

// 
interface d1{
	public void show();
	//public void get();
}
public class interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		d1 d = new d1()
		{
			public void show() {
				System.out.println("show");
			}

//			public void get() {
//				System.out.println("get");
//			}
		};

		d.show();
		//d.get();

	}

}
