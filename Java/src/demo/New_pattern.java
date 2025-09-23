package demo;

public class New_pattern {

	public static void main(String args[]) {
		
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<i; j++) {
				System.out.print(" ");
			} 
			for(int k=1; k<=5; k++) {
				System.out.print("*");
			}for(int l=1; l<=(5-i)*2; l++) {
				System.out.print(" ");
			}for (int h=1; h<=5; h++) {
				System.out.print("*");
			}
				System.out.println();
		}
		for(int i = 5; i>=1; i--) {
			for(int j =1; j<i; j++) {
				System.out.print(" ");
			} 
			for(int k=1; k<=5; k++) {
				System.out.print("*");
			}for(int l=1; l<=(5-i)*2; l++) {
				System.out.print(" ");
			}for (int h=1; h<=5; h++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
	}
}
