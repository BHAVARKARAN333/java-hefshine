package demo;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		
		int num= 123456789;
		int rem;
		while(num>0) {
			rem = num%10;
			p1.add(rem);
			num = num/10;
			
		}
		
		System.out.println(p1);
		
		for(Integer a:p1) {
			int c=0;
			for(int i=1; i<a; i++) {
				if(a%i==0) {
					c++;			
				}
				
			}
			if(c==1) {
				System.out.println(a);
			}
			
		}
		
	}

}
