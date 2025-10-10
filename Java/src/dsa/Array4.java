package dsa;
import java.util.*;
public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int [] name = new int[size];
		
		System.out.println("Enter the number of the index");
		
		for(int i=0; i<size; i++) {
			name[i] = sc.nextInt();
		}

		System.out.println("Enter the number to find index");
		
		int x = sc.nextInt();
		
		for(int i=0; i<name.length; i++) {
			if(name[i] == x) {
				System.out.println("Number is found at index  : " +i);
			}else {
				System.err.println("Number not found at index : "+i);
			}
		}
		
	}

}
