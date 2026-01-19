package demo;

import java.lang.*;
import java.util.Arrays;

public class jan_14 {
	
    public static void main(String[] args) {

//    	String s1 = "abc";
//        char c = 'k';  
//
//        char ch[] = s1.toCharArray();
//
//        for (int i = 0; i < ch.length; i++) {
//            if (ch[i] == 'a') {
//                ch[i] = c;
//            }
//        }
//        
//        System.out.println(ch);
        
        
        
        
        
        
        
        
//        
//        String s1 = "abc";
//        char c = 'k';
//        
//        char ch[] = s1.toCharArray();
//        
//        for(int i=0; i<ch.length; i++) {
//        	if (ch[i] == 'a') {
//        		ch[i]=c;
//        	}
//        }
//        System.out.println(ch);
    	
    	
    	
    	 String s1 = "abc";
         char ch = 'a';

         int c = 0;

         for (int i = 0; i < s1.length(); i++) {
             if (s1.charAt(i) == ch) {
                 c++;
             }
         }

         if (c == 0) {
             System.out.println("Not present");
         } else {
             String result = "";

             for (int i = 0; i < s1.length(); i++) {
                 if (s1.charAt(i) != ch) {
                     result = result + s1.charAt(i);
                 }
             }
        
             System.out.println(result);
        }
    	}
    	
    	
    	
    	
//    	String s1 = "qwerty";
//    	for(char ch = 'a'; ch<='z'; ch++) {
//    		for(int i=0; i<s1.length(); i++) {
//    			if (ch == s1.charAt(i))
//    			{
//    				System.out.println(ch);
//    			}
//    		}
//    	}
    	
    	
    	
//    	String s1 = "KARANkaran";
//    	for(char ch = 'A'; ch<='z'; ch++) {
//    		for(int i=0; i<s1.length(); i++) {
//    			if (ch == s1.charAt(i))
//    			{
//    				System.out.println(ch);
//    			}
//    		}
//    	}
    	
    	
//    	String s1 ="aopfhwfisj";
//    	System.out.println(s1);
//    			char ch[]=s1.toCharArray();
//    			Arrays.sort(ch);
//    			System.out.println(ch);
    	
    	
//    	
//    	String s1 = "silent";
//    	String s2 = "silent";
//    	
//    	if(s1.length()==s2.length()){
//    		char ch [] =s1.toLowerCase().toCharArray();
//    		char ch1[]=s2.toLowerCase().toCharArray();
//    		Arrays.sort(ch);
//    		Arrays.sort(ch1);
//    		System.out.println(ch);
//    		System.out.println(ch1);
//    		
//    		if(Arrays.equals(ch, ch1)) {
//    			System.out.println("anagram");
//    		}else {
//    			System.out.println("not anagram");
//    		}
//    		}
//    	else {
//    		System.out.println("length not same");
//    	}
    	}

