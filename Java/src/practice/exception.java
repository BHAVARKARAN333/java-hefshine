package practice;

import java.util.Scanner;

class MyException extends Exception{
	
	public MyException(String message) {
		super(message);
	}
	
}


public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of age");
		
		int age= sc.nextInt();
		
		try {
		
		if(age <=18) {
			
			throw new MyException("Age must be 18 or more");}
		else {
			System.out.println("you are adult");
		}
			
		} catch(Exception e) {
			System.out.println(e);
		}
}
}