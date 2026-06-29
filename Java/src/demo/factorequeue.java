package demo;
import java.util.*;
public class factorequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =5;
		
		PriorityQueue<Integer> p2 = new PriorityQueue<Integer>();
		
		for(int i=0; i<=num; i++) {
			p2.add(i);
		}
		
		System.out.println(p2);
		
	int fact = 1;
	
	for(int a:p2) {
		fact= fact*a;
	}
  System.out.println(fact);

}
}