package demo;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Queue<Integer> list = new LinkedList<>();
		Queue<Integer>list1 = new PriorityQueue<>();
		PriorityQueue<Integer> list2 = new PriorityQueue<>();
		PriorityQueue<Integer> list3 = new PriorityQueue<Integer>();
		
		
		list.add(20);
		list.add(30);
		list.offer(40);
		
		
		System.out.println(list);
		
	System.out.println(list.peek());
	
	}

}
