package december_batch;

public class array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a [] = {1,2,3,1,24,1};
//		int b=3
//				
//				;
//		int c=0;
//		for(int i=0; i<a.length; i++) {
//			
//			if(a[i]==b) {
//				c++;
//			}		
//			
//		}
//		
//		if(c==0) {
//			System.out.println("not found");
//		}else {
//			for(int j=0; j<a.length; j++) {
//				if(a[j]==b) {
//					continue;
//				}
//				System.out.println(a[j]);
//			}
//		}
		
		
		
		
	    int a[] = {1, 2, 3, 1, 24, 1};
        int b = 37;

        boolean found = false;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == b) {
                found = true;
            } else {
                System.out.println(a[i]);  
            }
        }

        if (!found) {
            System.out.println("not found");
        }

	}

}
