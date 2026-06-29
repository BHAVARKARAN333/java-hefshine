package demo;
import java.util.*;

public class sunofqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(11);
		p1.add(76);
		p1.add(3);
		p1.add(64);
		p1.add(23);
		p1.add(15);
		
		System.out.println(p1);
		
		int sum = 0;
		
		for (int num : p1) {
			sum +=num;
		}
		
		System.out.println(sum);
		
		
	}

}
