package december_batch;
class test4 {
	int a = 10;
}

class test5 extends test4 {
	int a = 100;
	void get() {
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class super_kewword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5 t = new test5();
		t.get();

	}

}
