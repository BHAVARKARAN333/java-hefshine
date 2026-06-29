package array;
import java.util.Scanner;

public class array_1 {
	public static void update(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr[i] +1;
		}
	}

	public static void main(String[] args) {
	
		int arr[] = {21,32,43,54,5};
		update(arr);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
	}


