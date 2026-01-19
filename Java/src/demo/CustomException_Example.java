package demo;

// Custom Exception
class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class CustomException_Example {

    static void Hello() throws MyException {
        int time = 12;
        if (time < 12) {
            
            throw new MyException("Good morning");
        } else {
            System.out.println("Good Afternoon");
        }
    }

    public static void main(String[] args) {

        try {
            Hello();
            System.out.println("Hi");
        } catch (MyException e) {
            System.out.println(e);
        }
        
        
        
        
        
    }
}
