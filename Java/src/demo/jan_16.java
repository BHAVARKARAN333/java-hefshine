package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jan_16 {

	public static void main(String[] args) {
		   try {
	            FileReader fr = new FileReader("../Java/src/demo/karan.txt");
	            BufferedReader br = new BufferedReader(fr);

	            
	                System.out.println(br.readLine());
	            
	          
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found");
	        } catch (IOException e) {
	            System.out.println("Error while reading file");
	        }
	}

}
