package demo;
import java.util.*;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<String>list1 = new LinkedList<String>();
		
		list1.add("karan");
		
		list.add(29);
		list.add(23);
		list.add(18);
		list.add(32);
		
		System.out.println(list);
				
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());			
		}
		
		list.remove(1);
		System.out.println("remove element "+list);
		
		list.addFirst(12);
		System.out.println("add first :"+list);
		
		list.addLast(44);
		System.out.println("add last :"+ list);
		
		System.out.println("first element return "+list.getFirst());
		System.out.println("return index number 3 : "+list.get(3));
		System.out.println("return last element "+list.getLast());
//	add last of list	
		list.offer(99);
		System.out.println("add last element "+list);
//		remove first ad last element
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
		
//		add element first and last
		System.out.println(list.offerFirst(1));
		System.out.println(list.offerLast(1));
		
		System.out.println(list);
		
//		return first element
		System.out.println(list.peek());
		
//		return first element
		System.out.println(list.peekFirst());
//		return last element
		System.out.println(list.peekLast());
		
//		Retrieves and removes the head (first element) of this list.
		System.out.println(list.poll());
		System.out.println(list);
		
//		Retrieves and removes the first element of this list, or returns null if this list is empty
		System.out.println(list.pollFirst());
		System.out.println(list);
		
//		Retrieves and removes the last element of this list, or returns null if this list is empty.
		System.out.println(list.pollLast());
		System.out.println(list);
//		add element first position
		list.push(33);
		System.out.println(list);
	
		
		Iterator<Integer> i = list.descendingIterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
