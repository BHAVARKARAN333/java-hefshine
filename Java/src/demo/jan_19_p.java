package demo;

public class jan_19_p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer();
//		s1.append("hellohelowhallowwfsdlf");
//		System.out.println(s1.capacity());
//		
//		
//		s1.append("hellohelowhallowwfsdlfhellohelowhallowwfsdlfq");
//		System.out.println(s1.capacity());
//		
//		s1.append("hellohelowhallowwfsdlfhellohelowhallowwfsdlfqhellohelowhallowwfhallowwfsdlf");
//		System.out.println(s1.capacity());
//		System.out.println(s1.length());
		
		
		
		
//		s1.append("karan");
//		System.out.println(s1);
//		s1.setLength(2);
//		System.out.println(s1);
		
		
		
		
//		StringBuffer s2 = new StringBuffer(s1);    //deep copy
//		s1.append("hello");
//		
//		
//		
//		//System.out.println(s1==s2);
//		//System.out.println(s1.equals(s2));
//		
//		System.out.println(s1.subSequence(0, 3));   // bufferString   //mutable   // sync
//		System.out.println(s1.substring(1, 4));    // String     immutable       // non-sync
//		System.out.println(s1.substring(2));      // Strings
//		
		
		
		s1.append("Hello hefshine");
		s1.reverse();
		System.out.println(s1);
		
		System.out.println(s1.capacity());
		
		s1.ensureCapacity(200);
		System.out.println(s1.capacity());
		
	}

}
