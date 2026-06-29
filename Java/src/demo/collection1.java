package demo;
import java.util.*;
public class collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(43);
		li.add(23);
		li.add(32);
		li.add(41);
//		
//		System.out.println(li);
		
		ArrayList<String> newli = new ArrayList<String>();
		
		newli.add("C");
		newli.add("C++");
		newli.add("Java");
		newli.add("Pyhton");
		newli.add("chatgpt");
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("banana");
		list.add("Apple");
		list.add("Guava");
		list.add("Draganfruit");
		
		 System.out.println(list);
		 
		 Iterator<String> itr = list.iterator();

	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        
	        
	        
	        
	        
	        System.out.println();
	        
	        ListIterator<String> itr1 = list.listIterator(list.size());

	        System.out.println("Backward Traversal:");

	        while (itr1.hasPrevious()) {
	            System.out.println(itr1.previous());
	        }
		 
		 
	}
	
	

}
