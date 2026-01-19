package demo;
import java.text.*;
import java.text.ParseException;
import java.util.Date;


public class jan_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		try {
//			Thread.sleep(3000);
//			System.out.println("hello");
//		}
//		catch(InterruptedException e) {
//			e.printStackTrace();
//		}

		
		
//		try {
//			SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-DD");
//			Date date = sd.parse("2026-19-11");
//			System.out.println(date);
//		}
//		catch(ParseException e) {
//			System.out.println(e);
//		}
//		
		
		
		try {
			Class.forName("demo.jan_19");
			System.out.println("Class found");
		}
		
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("hello");
		
	}

}
