package demo;
import java.util.*;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer>p1 = new PriorityQueue<Integer>();
		
		
		int num=123;
		int rem;
		while(num>0) {
			
			rem = num%10;
			p1.add(rem);
			num = num/10;
										
		}
		
		System.out.println(p1);
		int sum=0;
		int c=0;
		for(Integer a:p1) {
//			sum = sum +a;
			c++;

	}
		System.out.println(c);
		System.out.println(p1.size());
		

}}
