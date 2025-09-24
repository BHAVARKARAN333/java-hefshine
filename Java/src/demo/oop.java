package demo;
import java.util.*;
//class Test {
//	int a =10;
//	float b = 20.67f;
//	double c = 30.9876;
//	String d = "karan";
//	char ch = 'k';
//	
//}
// class student {
//	 int id=1;
// }


class Task{
	int id = 111;
}
public class oop {
	public static void main(String args[]) {


		//		Test tt = new Test();
		//		
		//		//test -> class name
		//		//tt -> add of object 
		//		//new -> creates new object and stored in heap area
		//		// Test() -> default constructor 
		//		
		//		System.out.println(tt.a);
		//		System.out.println(tt.b);
		//		System.out.println(tt.c);
		//		System.out.println(tt.d);
		//		System.out.println(tt.ch);
		//	Scanner sc = new Scanner(System.in);	
		//		
		//		
		//		student s1 = new student();
		//		System.out.println("Enter The Number");
		//		int x = s1.id=sc.nextInt();
		//		System.out.println(x);
		//		student s2 = new student();
		//		int y= s2.id=sc.nextInt();
		//		System.out.println(y);
		//		student s3 = new student();
		//		int z = s3.id=sc.nextInt();
		//		System.out.println(z);
		//		student s4 = new student();
		//		int a = s4.id=sc.nextInt();
		//		System.out.println(a);
		//		student s5 = new student();
		//		int b = s5.id=sc.nextInt();
		//		System.out.println(b);

		//		
		//		Task t1 = new Task();
		//		int x = t1.id;
		//		int fact = 1 ;
		//		for(int i = 1; i<=x; i++) {
		//			fact = fact *i;
		//		} System.out.println(fact);
		//		
		//		
		//		int rem;
		//		int sum = 0;
		//		Task t2 = new Task();
		//		int y = t1.id;
		//		
		//		while(y>0) {
		//			rem = y % 10;
		//			sum = sum+rem;
		//			y= y/10;
		//		}System.out.println(sum);
		//		
		int sum = 0;
		int rem;
		Task t3 = new Task();
		int z = t3.id;
		while(t3.id>0) {
			rem = t3.id % 10;
			sum = sum*10+rem;
			t3.id=t3.id/10;

		}System.out.println(sum);
if(sum==z) {
	System.out.println("number is palindrome");
}else {
	System.out.println("not a palindrome");
}
	}}
