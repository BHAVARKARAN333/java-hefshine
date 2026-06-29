package demo;
import java.util.*;

public class sumthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> p3 = new PriorityQueue<Integer>();
		int rem;
		int num = 123;
		while(num>0) {
			rem = num%10;
			p3.add(rem);
			num = num/10;
			
		}

		System.out.println(p3);
		int sum=0;
		for(Integer a:p3) {
			sum = sum +a;
		
		}
		System.out.println(sum);
	}

}
//find the sum of digit and count of digit