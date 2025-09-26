package demo;

class karan {
	
	int g;
	String l;
	 void get(int n, String name) {
		g = n;
		l = name;
	}
	 void set() {
		System.out.println(g +" "+ l);
	}
	
}

public class static_overloading {
	public static void main(String args[]){
		
		karan k = new karan();
		
		k.get(12, "static");
		k.set();
		
		
	}
}
