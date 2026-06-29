package demo;
import java.lang.*;
import java.util.PriorityQueue;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	 PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
	 p1.add(23);
	 p1.add(3);
	 p1.add(2);
	 p1.add(12);
	 p1.add(33);
	 p1.add(24);
	 System.out.println(p1);
	 
	 
	 
	 
	 int n = p1.size();
	 
	 for(int i=1; i<=n; i++) {
		 System.out.println(p1.poll());
		 
	 
	 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
//	 System.out.println(p1.peek());
//	 System.out.println(p1.poll());
//	 System.out.println(p1);
	 
	 
//	 p1.clear();
//	 
////	 returns null if queue is empty
//	 System.out.println(p1.peek());
////	returns exception if queue is empty 
//	 System.out.println(p1.element());
//	 

//	 p1.clear();
//	 
////	 returns null if queue is empty
//	 System.out.println(p1.poll());
////	returns exception if queue is empty 
//	 System.out.println(p1.remove());
//	 
//	 int n = p1.size();
//	 
//	 for(int i=1; i<n; i++) {
//		 System.out.println(p1.poll());
	 
	 
	} 

}
