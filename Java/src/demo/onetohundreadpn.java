package demo;

public class onetohundreadpn {
	public static void main(String[] args) {
		
	
	for(int j=1; j<=100; j++) {
	
	
		int c=0;
		for(int i = 1; i<=j; i++) {
			if(j%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println(j);
		}
	}
}
}