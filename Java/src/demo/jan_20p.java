package demo;

public class jan_20p {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer();
		 s1.append("hello");
		 
		 s1.replace(0, 4, "n");
		 System.out.println(s1);
		 
		 StringBuffer s2 = new StringBuffer();
		 
		 s2.append("hello");
		 System.out.println(s2.lastIndexOf("l"));
		 
		 s2.insert(0, "hefshine");
		 System.out.println(s2);
		 
		 
		 StringBuffer s3 = new StringBuffer();
		 s3.append("hello");
		 s3.delete(0, 2);
		 System.out.println(s3);
		 s3.deleteCharAt(0);
		 System.out.println(s3);
	}

}
