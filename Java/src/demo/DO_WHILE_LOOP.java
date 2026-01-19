package demo;
import java.util.*;
public class DO_WHILE_LOOP {

	public static void main(String args[]) {
		int i=1;
		//		do {
		//			System.out.println(i);
		//			i++;
		//		} while(i<=10);
		//		
		//		
		//		System.err.println("----------------------------------------");
		//		
		//		int j=10;
		//		do {
		//			System.out.println(j);
		//			j--;
		//		}while(j>=1);
		//		
		//		
		//		System.err.println("----------------------------------------------");
		//		System.out.println("Enter the number :");
		//		
		//		
		//	 Scanner sc = new Scanner(System.in);
		//	 int integer = sc.nextInt();
		//		
		//		int k=1;
		//		do {
		//			System.out.println(k+" * "+integer+" = "+k*integer);
		//			k++;
		//		}while(k<=10);



		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number:");
		int num = sc.nextInt();
		System.out.println("1.even_odd\n2.pos_neg\n3.exit");
		int ch;
		do {
			System.out.println("Ennter your option");
			ch = sc.nextInt();


			switch(ch) {
			case 1:
				if(num%2==0) {
					System.out.println("even");
				}else {
					System.out.println("odd");
				}
				break;
			case 2:
				if(num>0) {
					System.out.println("positive");
				}else if(num<0){
					System.out.println("negative");
				}else {
					System.out.println("Zero");
				}
				break;
			case 3: 
				System.out.println("exit");
				break;
			default:
				System.out.println("invalid");




			}
		}while(ch!=3);

	}
}
