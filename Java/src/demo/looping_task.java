package demo;
import java.util.*;

public class looping_task {
	public static void main(String[] args) {
		System.out.println("Enter a day");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
	if (num==1) {
		System.out.println("Monday");
	}else if (num==2) {
		System.out.println("Tuesday");
	}else if (num==3) {
		System.out.println("Wednesday");
	}else if (num==4) {
		System.out.println("Thursday");
	}else if (num==5) {
		System.out.println("Friday");
	}else if (num==6) {
		System.out.println("Saturday");
	}else if (num==7) {
		System.out.println("Sunday");
	}else {
		System.out.println("Inalid");
	}

}
}	