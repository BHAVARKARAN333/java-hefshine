package demo;
import java.util.*;

public class looping_task {
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				even_sum +=i;
				
			}else {
				odd_sum +=i;
			}
		}
				
		
	System.out.println("Even sum is "+even_sum);
		System.out.println("Odd sum is "+odd_sum);
		
	}

}
