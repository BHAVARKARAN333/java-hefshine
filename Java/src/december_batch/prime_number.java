package december_batch;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,3};
		int ba=0;
		ba = a[0];
		for(int i = 0; i<a.length; i++) {
			int num=a[i];
			int c=0;
			for(int j=1; j<=num; j++) {
				
				if(num%j==0) {
					c++;
				}
				
			}
			if(c==2) {
				System.out.println(num);
			}
		}

	}

}
