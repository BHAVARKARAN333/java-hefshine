package array;
import java.util.*;

public class largest_value {
	public static int largest(int array[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++ ) {
			if(largest<array[i]) {
				largest= array[i];
			}
		}
		return largest;
	}
	

	public static void main(String[] args) {
		
		int array[] = {1,2,3,4,225,6,7};
		
		System.out.println("largest value is "+largest(array));

	}

}
