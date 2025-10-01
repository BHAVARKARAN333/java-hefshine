package demo;

class test7{
	int i;
	String n;
	int p;
	test7(int id,String name, int pin){
		i=id;
		n=name;
		p=pin;
		
	}
	
	test7(test7 dd){
		i=dd.i;
		n=dd.n;
		p=dd.p;
		
	}
	
	void show() {
		System.out.println(i+" "+n+ " "+p);
	
	}
}
public class copy_constructor {
	public static void main(String args[]) {
		
		
	test7 t1 = new test7(2,"karan",1111);	
	t1.show();
	System.out.println();
	test7 t2 = new test7(t1);
	t2.show();
System.out.println();
	test7 t3 = new test7(t2);
	t3.show();

		
	}

}
