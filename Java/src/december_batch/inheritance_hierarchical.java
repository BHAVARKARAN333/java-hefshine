package december_batch;

class payment{
	
	void money() {
		System.out.println("money");
	}
}

class sbi extends payment{
	void cash(){
		System.out.println("cash");
		
	}
}

class kotak extends payment{
	
	void online() {
		System.out.println("online");
	}
}

class hdfc extends payment{
	void check() {
		System.out.println("check");
	}
}
public class inheritance_hierarchical {
	
	public static void main(String args []) {
		
		sbi s = new sbi();
		s.money();
		s.cash();
		
		kotak k = new kotak();
		
		k.money();
		k.online();
	}

}
