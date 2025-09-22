package demo;
;

public class pattern {
	 public static final String RESET = "\u001B[0m";
	    public static final String RED = "\u001B[31m";
	    public static final String GREEN = "\u001B[32m";
	    public static final String YELLOW = "\u001B[33m";
	    public static final String BLUE = "\u001B[34m";
	    public static final String PURPLE = "\u001B[35m";
	public static void main(String[] args) {
		
//	for(int i=1; i<=5; i++) {       //1<=5 2<=5 3<=5 4<=5 5<=5 6<=5F
//			
//		for(int j=1; j<=5; j++) {   //1<=5 2<=5 3<=5 4<=5 5<=5 6<=5F
//			System.out.print("*");
//		}
//		System.out.println();
//	}
	
		
//	
//		for(int i=5; i>=1; i--) {             
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
		
		
	
//		for(int i=1; i<=5; i++) {
//			
//			for(int j=i; j<5; j++) {
//				System.out.print(" ");
//				
//			}
//			
//			for (int k=1; k<=(2*i-1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		int rows = 5;
//
//        for (int i = 1; i <= rows; i++) {
//            // print left spaces
//            for (int j = rows; j > i; j--) {
//                System.out.print(" ");
//            }
//            // print stars
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
		
//		
//		for(int i=1; i<=5; i++) {
//			for(int j=4; j>=i; j--) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		
//		
//	
//
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=i; k<=4; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}
//		
//		
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=4; k>=i; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		for (int i = 1; i <= 5; i++) {// i=1
//            for (int j = 1; j <= i; j++) {//j=1 j<=i=1
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 5; k++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//        for (int i=1;i<=5;i++){// i=1
//            for (int j=i;j<=5;j++){//j=1 j<=i=1
//                System.out.print(" ");
//            }
//            for (int k=1;k<=5;k++){
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//        }
//		
		
		 String[] K = {
		            "*   *",
		            "*  * ",
		            "***  ",
		            "*  * ",
		            "*   *"
		        };

		        String[] A = {
		            " *** ",
		            "*   *",
		            "*****",
		            "*   *",
		            "*   *"
		        };

		        String[] R = {
		            "**** ",
		            "*   *",
		            "**** ",
		            "*  * ",
		            "*   *"
		        };

		        String[] N = {
		            "*   *",
		            "**  *",
		            "* * *",
		            "*  **",
		            "*   *"
		        };

		        // Assign colors to each letter
		        String[][] NAME = {K, A, R, A, N};
		        String[] COLORS = {RED, GREEN, YELLOW, BLUE, PURPLE};

		        for (int i = 0; i < 5; i++) {  // 5 rows
		            for (int j = 0; j < NAME.length; j++) {
		                System.out.print(COLORS[j] + NAME[j][i] + "   " + RESET);
		            }
		            System.out.println();
		        }
	}
				
	}


