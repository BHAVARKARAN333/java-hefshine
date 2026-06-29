package december_batch;

import java.util.Scanner;

public class array_addition {

	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array to add : ");
		int n =sc.nextInt();

		int a [] = new int[n];
		int b [] = new int[n];
		int c [] = new int[n];

		System.out.println("Enter first array number");

		for(int i = 0 ; i<a.length; i++) {
			a[i]=sc.nextInt();
		}

		System.out.println("Enter second array number");

		for(int i = 0 ; i<a.length; i++) {
			b[i]=sc.nextInt();
		}

		for(int i = 0 ; i<a.length; i++) {
			c[i] =  a[i]+ b[i];
		}
		System.out.println();
		System.out.println("index of array a");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");

		}
		System.out.println();
		System.out.println("index of array b");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(b[i]+" ");

		}
		System.out.println();
		System.out.println("Addition of array a and b");
		for(int i = 0 ; i<a.length; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
