package demo;

public class jan_panagra_16 {

	public static void main(String[] args) {

		//		String s = "my name is karan";
		//        s = s.toLowerCase();
		//
		//        boolean isPangram = true;
		//
		//        for (char ch = 'a'; ch <= 'z'; ch++) {
		//
		//            if (s.indexOf(ch) == -1) {
		//                isPangram = false;
		//                break;
		//            }
		//        }
		//
		//        if (isPangram) {
		//            System.out.println("pangram");
		//        } else {
		//            System.out.println("not pangram");
		//        }


		//		String s1 = "asdfghjklqwertyuiopzxcvbnmmmmmmmmmm";
		//		
		//		int count = 0;
		//
		//		for (char ch = 'a'; ch <= 'z'; ch++) {
		//		    for (int i = 0; i < s1.length(); i++) {
		//		        if (s1.charAt(i) == ch) {
		//		            count++;
		//		            break;  
		//		        }
		//		    }
		//		}
		//
		//		if (count == 26) {
		//		    System.out.println("Pangram");
		//		} else {
		//		    System.out.println("Not Pangram");
		//		}
		//		
		//		


		//		String s = "zxcvbnmasdfghjklqwertyuiop";
		//		s = s.toLowerCase();
		//		int c = 0;
		//		for(char ch='a';ch<='z';ch++)
		//		{
		//			if(s.indexOf(ch)!=-1)
		//			{
		//				c = c+1;
		//				
		//			}
		//		}
		//		
		//		if(c==26)
		//		{
		//			System.out.println("Panagram");
		//		}
		//		else
		//		{
		//			System.out.println("Not panagram");
		//		}


//		String s1 = "aabb";
//
//		for (int i = 0; i < s1.length(); i++) {
//
//			int c = 0;
//
//			for (int j = i + 1; j < s1.length(); j++) {
//
//				if (s1.charAt(i) == s1.charAt(j)) {
//					c++;   
//				}
//			}
//
//			if (c == 0) {
//				System.out.println(s1.charAt(i)+" "+ (i)); }
//		}

		
//		String s1 = "aabb";
//
//		for (int i = 0; i < s1.length(); i++) {
//
//			int c = 0;
//
//			for (int j = 0; j < i; j++) {
//
//				if (s1.charAt(i) == s1.charAt(j)) {
//					c++;   
//				}
//			}
//
//			if (c == 0) {
//				System.out.println(s1.charAt(i)+" "+ (i)); }
//		}

		
//		 String s = "aacbbcc";
//
//	        for (int i = 0; i < s.length(); i++) {
//
//	            if (s.indexOf(s.charAt(i)) == i) {
//
//	                int count = 0;
//
//	                for (int j = 0; j < s.length(); j++) {
//	                    if (s.charAt(i) == s.charAt(j)) {
//	                        count++;
//	                    }
//	                }
//
//	                System.out.println(s.charAt(i) + " = " + count);
//	            }
//	        }
//	       
//		int max = Integer.MAX_VALUE;
//		String s = "aaabbbcccdd";
//		for(int i=0;i<s.length();i++)
//		{
//			int c = 0;
//			for(int j=0;j<i;j++)
//			{
//				if(s.charAt(i)==s.charAt(j))
//				{
//					c++;
//				}
//				
//			}
//			if(c==0)
//			{
//				
//				int count = 0;
//				for(int k=0;k<s.length();k++)
//				{
//					if(s.charAt(i)==s.charAt(k))
//					{
//						count++;
//					}
//				}
//				System.out.println(s.charAt(i)+" = "+count);
//			}
//	        
//	        if(max < c) {
//	        	max=c;
//	        }
//		}
		
//		System.out.println();
		
		
//		String s = "abccds";
//		int max = Integer.MAX_VALUE;
//		int min = Integer.MIN_VALUE;
//		
//		for(int i =0; i<s.length(); i++) {
//			int c = 0;
//		
//		for(int j =0; j<i; j++) {
//			if(s.charAt(i)==s.charAt(j)) {
//				c++;
//			}
//		} 
//		if(c==0) {
//			int count = 0;
//			for(int k=0; k<s.length(); k++) {
//				if(s.charAt(i)==s.charAt(k)) {
//					count++;
//				}
//			}
//				System.out.println(s.charAt(i)+"="+count);
//				
//				if (max <c ) {
//					max = c;
//					{
//						System.out.println("max");
//					}
//				}
//				
//				
//			}
//		}
//		
		
		
		String s = "abbccsss";
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		char ch = 0;
		char ch1 = 0;
		for(int i=0;i<s.length();i++)
		{
			int c = 0;
			for(int j=0;j<i;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					c++;
				}
				
			}
			if(c==0)
			{
				for(int k=0;k<s.length();k++)
				{
					if(s.charAt(i)==s.charAt(k))
					{
						c++;
					}
				}
				if(max < c)
				{
					max = c;
					ch = s.charAt(i);
				}
				if(min > c)
				{
					min = c;
					ch1 = s.charAt(i);
				}
			    
			}
		}
		System.out.println("Max freq. = "+max+" "+ch);
		System.out.println("Min freq. = "+min+" "+ch1);
	}
}

