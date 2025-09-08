package demo;
import java.util.*;
public class swapping {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Taking input
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("\nBefore Swapping: a = " + a + ", b = " + b);

	        // Swapping logic (without using third variable)
	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After Swapping: a = " + a + ", b = " + b);
	        
	        sc.close();
	    }
}


//int temp = a;
//a = b;
//b = temp;
