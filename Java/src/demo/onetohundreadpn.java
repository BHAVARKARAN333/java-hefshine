package demo;

public class onetohundreadpn {
	public static void main(String[] args) {
		
	int sum = 0;
	for(int j=1; j<=100; j++) {
	
	
		int c=0;
		for(int i = 1; i<=j; i++) {
			if(j%i==0) {
				c++;
			}
		}
		if(c==2) {
			sum = sum+j;
		}
		
	}
	System.out.println("sum of prime number : "+sum);
}
}