package demo;



class student{
	int show(int a){
		return a;
	}
	 String show1(String a){
		return a;
	}
	 
	 float show2(float a){
			return a;
		}
	 
	 double show3(double a){
			return a;
		}
	 
	 long show4(long a){
			return a;
		}
	 char show5(char a) {
		 return a;
	 }
	 boolean show6(boolean a) {
		 return a;
	 }
	 short show7(short a) {
		 return a;
	 }
	 byte show8(byte a, byte b) {
		 return (byte)(a+b);
	 }




}

public class return_function {

	public static void main(String args[]) {

		student s1 = new student();
		
		System.out.println(s1.show(2));
		System.out.println(s1.show1("karan"));
		System.out.println(s1.show2(56.5f));
		System.out.println(s1.show3(8564));
		System.out.println(s1.show4(4848484));
		System.out.println(s1.show5('A'));
		System.out.println(s1.show6(true));
		System.out.println(s1.show7((short)23));
		System.out.println(s1.show8((byte)101, (byte)64));
				

	}
}
