package demo;

public class StringBuilderDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s1 = new StringBuilder();
		s1.append("hello world");
		System.out.println(s1);
		
		System.out.println(s1.length());
		
		System.out.println(s1.capacity());
		
		s1.ensureCapacity(100);
		System.out.println(s1.capacity());
		
		s1.setLength(50);
		System.out.println(s1.length());
		
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.reverse());
		
		
		StringBuilder s2 = new StringBuilder();
		s1.append("hello world");
		
		System.out.println(s1.equals(s2));
		
		s1.insert(1, "karan");
		
		s1.delete(0, 1);
		s1.deleteCharAt(0);
		System.out.println(s1);

}
}