package dsa;
import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size if the array");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] name = new int[size];
		
		System.out.println("Enter the number of array");
		
		for(int i=0; i<size; i++) {
			name[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0; i<name.length; i++ ) {
			
			if(name[i] <min ) {
				min = name[i];
			}
			
			
			if(name[i]>max) {
				max = name[i];
			}
		}
		
		System.out.println("The maximun number if array is :" +max);
		System.out.println("The minimun number if array is :" +min);
		
		
	}


}
 