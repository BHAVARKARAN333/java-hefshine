package demo;
import java.util.*;

public class test_16_9 {

	public static void main(String args[]) {

		//		int x=10;
		//		if(x>10) {
		//			System.out.println("greater");
		//		} else if (x==10) {
		//			System.out.println("equal");
		//		}else {
		//			System.out.println("smaller");
		//		}
		//
		//
		//
		//		int a= 5, b= 10;
		//		int result =(a>b)?(a-b):(b-a);
		//		System.out.println(result);


		//		int num = -5;
		//
		//		if(num > 0) {
		//		    if(num % 2 == 0) {
		//		        System.out.println("Positive even");
		//		    } else {
		//		        System.out.println("Positive odd");
		//		    }
		//		} else if(num < 0) {
		//		    System.out.println("Negative");
		//		} else {
		//		    System.out.println("Zero");
		//		}
		//	


		//		int day = 3;
		//		
		//		 switch(day) {
		//         case 1:
		//             System.out.println("Monday");
		//             break;
		//         case 2:
		//             System.out.println("Tuesday");
		//             break;
		//         case 3:
		//             System.out.println("Wednesday");
		//             break;
		//         case 4:
		//             System.out.println("Thursday");
		//             break;
		//         case 5:
		//             System.out.println("Friday");
		//             break;
		//         case 6:
		//             System.out.println("Saturday");
		//             break;
		//         case 7:
		//             System.out.println("Sunday");
		//             break;
		//         default:
		//             System.out.println("Invalid day number! Please enter 1 to 7.");
		//     
		//
		//		 }

		//		 
		//		 int i = 5;
		//		  while(i<=5) {
		//			  i++;
		//			  
		//		  }
		//		  System.out.println(i);



		//		int n = 5;
		//		do {
		//			System.out.println("Nuber = " +n);
		//			n--;
		//		}while(n>5);
		//
		//
		//
		//		Scanner sc = new Scanner (System.in);
		//		int marks = sc.nextInt();
		//		
		//		if()

		//		int n = 5;
		//
		//        // Top half
		//        for (int i = 1; i <= n; i++) {
		//            // Left side ( > shift )
		//            for (int j = 1; j <= i; j++) {
		//                System.out.print(" ");
		//            }
		//            for (int k = 1; k <= n; k++) {
		//                System.out.print("*");
		//            }
		//
		//            // Space between two parts
		//            for (int s = 1; s <= (n - i) * 2; s++) {
		//                System.out.print(" ");
		//            }
		//
		//            // Right side ( < shift )
		//            for (int k = 1; k <= n; k++) {
		//                System.out.print("*");
		//            }
		//
		//            System.out.println();
		//        }
		//
		//        // Bottom half
		//        for (int i = n; i >= 1; i--) {
		//            // Left side ( > shift )
		//            for (int j = 1; j <= i; j++) {
		//                System.out.print(" ");
		//            }
		//            for (int k = 1; k <= n; k++) {
		//                System.out.print("*");
		//            }
		//
		//            // Space between two parts
		//            for (int s = 1; s <= (n - i) * 2; s++) {
		//                System.out.print(" ");
		//            }
		//
		//            // Right side ( < shift )
		//            for (int k = 1; k <= n; k++) {
		//                System.out.print("*");
		//            }
		//
		//            System.out.println();
		//        }
		//        

//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for (int k=1; k<=4; k++) {
//				System.out.print("*");
//			}
//			for (int l=1; l<=5-i; l++) {
//				System.out.print(" ");
//			}
//			for(int m=1; m<=5-i; m++) {
//				System.out.print(" ");
//			}
//			for(int n=1; n<=4; n++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for(int i=4; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=4; k++) {
//				System.out.print("*");
//			}
//			for (int l=1; l<=5-i; l++) {
//				System.out.print(" ");
//			}
//			for(int m=1; m<=5-i; m++) {
//				System.out.print(" ");
//				
//			}for (int n=1; n<=4; n++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}



//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=2*i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}


		
		for(int i=1; i<=6; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("-");
			} for(int k=1; k<=i*2-1; k++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("-");
			}
			for(int k=i*2-1; k<=9; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		
//		int num= 131;
//		int rev=0;
//		int rem;
//		int sum=0;
//		int temp=num;
//		
//		
//		while(num>0) {     // 131>0         13>0        1>0            0>0F
//			rem= num%10;   // 131%10=1      13%10=3      1%10= 1
//			rev = rev*10+rem;  //0*10+1=1   1*10+3=13    13*10+1=131 
//			num = num/10;    //131/10=13    13/10=1      1/10=0
//			
//			
//		}
//		
//		if (temp==rev) {        //  131 == 131 T
//			System.out.println("palindrome");    //   o/p   palindrome
//		} else {
//			System.out.println("not");
//		}
//		
//		
//		
		
	
		
	

	}
}



