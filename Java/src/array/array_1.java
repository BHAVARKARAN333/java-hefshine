package array;
import java.util.Scanner;

public class array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 ="abc";
		char c = 'k';
		
		char ch[] = s1.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] == 'a') {
				ch[i] =c;
			}
		}
		
		System.out.println(ch);
		}

	}


