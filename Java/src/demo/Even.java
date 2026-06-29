package demo;

import java.util.PriorityQueue;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>p1 = new PriorityQueue<Integer>();
		int num=1234567;
		int rem;
		while(num>0) {
			
			rem = num%10;
			p1.add(rem);
			num = num/10;
										
		}
  System.out.println(p1);
  
  for(Integer a:p1) {
	  if(a%2==0) {
//		  System.out.println(a);
		  int fact =1;
		  for(int i=1; i<=a; i++) {
			  
		  }
		  System.out.println(a + "   "+fact);
	  }
	  
	
	  
  }
  
		
	}

}
