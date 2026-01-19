package demo;

class MyException extends Exception{
	
	MyException(String msg){
		Super(msg);
		
	}
}
public class pass_fail_custom {
	
	static void hello() throws MyException{
		int age = 17;
		if(age > 18) {
			throw new MyException("adult");
		}else {
			System.out.println("not adult");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  try {
	            hello();
	            System.out.println("Try again");
	        } catch (MyException e) {
	            System.out.println(e);
	        }
	       
		  
		  
	        
	}

}
