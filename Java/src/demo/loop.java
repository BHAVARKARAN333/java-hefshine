package demo;
import java.util.*;

public class loop {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		System.out.println("Enter a second number");
		int b= sc.nextInt();		
		
//		if(n%2 ==0) {
//			System.out.println("Number is even");
//		}else {
//			System.out.println("Number is odd");
//		}
		
		if (a>b) {
			System.out.println(a+" is greater than "+b);
		}else if(a==b) {
			System.out.println(a+" = "+b);
		}else {
			System.out.println(a+" is smaller "+b);
		}
		
		
		
		
	}
}
