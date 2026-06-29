package apanacollege;
import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  int arr [] = new int[] {1,2,2,1,1,2,2};
  int n = arr.length;
  
//  brute force 
  
//  for(int i=0; i<n; i++) {
//	  int count=0; 
//	  for(int j=0; j<n; j++) {
//		  if(arr[i]==arr[j]) {
//			  count++;
//		  }
//	  }	  
//	  if(count>n/2) {
//		  System.out.println(arr[i]);
//		  break;
//	  }
//	    }
//  
//  
  
  Arrays.sort(arr);
  
  int freq = 1;
  int ans = arr[0];
  
  for(int i=1; i<n; i++) {
	  
	  if(arr[i]==arr[i-1]) {
		  freq ++;
	  }else {
		  freq = 1;
		  ans = arr[i];
	  }
	  
	  if(freq>n/2) {
		  System.out.println(ans);
	  }
  }
  
  
	}

}
