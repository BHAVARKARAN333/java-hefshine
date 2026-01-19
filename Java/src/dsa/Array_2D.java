package dsa;
import java.util.*;
public class Array_2D {
	public  static void main(String main[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of row ");
		int row = sc.nextInt();
		System.out.println("Enter the index of coloumn");
		int col= sc.nextInt();
		
		int number [][] = new int[row][col];
		
		System.out.println("Enter the index numbers");
		
	for(int i = 0; i<row; i++) {
		for(int j = 0; j<col; j++) {
			number[i][j] = sc.nextInt();
		}
	}
		
		
	System.out.println("The output of the 2D array");
		
	for(int i = 0; i<row; i++) { 
		for(int j = 0; j<col; j++) {
			System.out.print(number[i][j]+" ");
		} System.out.println();
	}	
	
	}

}
