package december_batch;

import java.util.Scanner;

public class array_float {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float arr1[] = new float[5];
		
		for(int i = 0; i<arr1.length; i++) {
			arr1[i] = sc.nextFloat();
		}

		for(int j = arr1.length/2; j<arr1.length; j++) {
		 System.out.print(arr1[1]+" ");
		}
		
		
	}

}
