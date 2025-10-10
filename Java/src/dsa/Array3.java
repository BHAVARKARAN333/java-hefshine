package dsa;
import java.util.*;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index");
		int size = sc.nextInt();
		
		int [] name = new int[size];
		
		System.out.println("Enter the index numbers");
		for(int i=0; i<size; i++) {
			name[i] = sc.nextInt();
		}

		System.out.println("your index nunber are :");

		for(int i=0; i<size; i++) {
			System.out.println(name[i]);
		}
	}

}
