package december_batch;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i<arr.length; i++) {
			System.out.println("Enter the number of " +i+ " index");
			arr[i] = sc.nextInt();
		}

		System.out.println("all nubers");
		for(int j = arr.length/2; j<arr.length; j++) {
			System.out.print(arr[j]+" ");

		}
		
		
		for(int j = 0; j<arr.length/2; j++) {
			System.out.print(arr[j]+" ");
			}
		
	}

}
