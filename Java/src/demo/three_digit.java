package demo;

import java.util.Scanner;

public class three_digit {
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		if (99<a && 999>=a) {
			System.out.println("number is 3 digit");
		}else {
			System.out.println("Number is not a 3 digit");
		}
		
		
	
		
	}
	
	}
