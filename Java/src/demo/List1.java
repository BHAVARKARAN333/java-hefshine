package demo;
import java.util.*;
public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    List l = new ArrayList();
	    
		ArrayList<Integer> list = new ArrayList();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		
		l.add("karan");
		System.out.println(l);
		
		
		list1.add(1);
		list1.add(15);
		list1.add(17);
		list1.add(14);
		list1.add(13);
		list.add(43);
		list.add(25);
		
		System.out.println(list1);


		list1.remove(0);
		System.out.println(list1);
		
//		list1.removeAll(list1);
//		System.out.println(list1);
		
		
		list.addAll(list1);
		
		System.out.println(list);
		
		
		System.out.println(list1.contains(list));
		System.out.println(list1.containsAll(list));
		
		l.addAll(list1);
		System.out.println(l);
		System.out.println(l.containsAll(list1));
		l.remove(0);
		System.out.println(l);
		System.out.println(list1);
		System.out.println(l.contains(list1));
		
	}

}
