package december_batch;
import java.util.*;

public class smallest_number {
	
	public static int getsmallest(int array[]) {
	 int smallest = Integer.MAX_VALUE;
	 for(int i= 0; i<array.length; i++) {
		 if(smallest>array[i]) {
			  smallest=array[i];
		 }
	 }
	 return smallest;
	}

	public static void main(String[] args) {
		int array[] = {43,54,24,54,34,64,34,545,2,24,66,45};

		System.out.println("smallest nunber of array is "+ getsmallest(array));
	}

}
