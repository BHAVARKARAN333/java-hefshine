package array;

public class Array_findnumber {
	public static int linear(int num[], int key) {
		for(int i=0; i<num.length; i++) {
			if(num[i]==key) {
				return i;
				}
		}
		return -1;
	}

	public static void main(String[] args) {
	
		int num[] = {3,4,2,5,67,24,43,54,656,24,45};
		int key = 43;
			
		int index = linear(num, key);
		if(index==-1) {
			System.out.println("not found");
		
		}
		else {
			System.out.println("key is at index "+index);
		}
	}
}
