package december_batch;

import java.util.Scanner;

public class hotel_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	String array[][] = new String[10][5];
	
	System.out.println("Enter the number of customer");
	int n =sc.nextInt();
	for(int i=0; i<n; i++) {
		
		System.out.println("Inter the name of customer");
		String name = sc.next();
		
		System.out.println("Enter the floor 0-9");
		int j = sc.nextInt();
		
		System.out.println("Enter the room numner 0-4");
		int k = sc.nextInt();
		array[j][k] = name;
		
		System.out.println("room booked");
	}
	
	
	int floor = sc.nextInt();
	int room = sc.nextInt();
	
	if(array[floor][room]!=null) {
		System.out.println("Room is booked");
	}else {
		System.out.println("Room is avalable");
	}
	
		
			
		}
}
