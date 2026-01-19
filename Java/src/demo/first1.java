package demo;

public class first1 {
	public static void main(String args []) {
		int a[][] = { {1,2,3,4},{4,5,6,5},
				{2,7,8,1},{1,3,6,9}};
		int sum=0;
		int c=0;
		for(int i=1;i<a.length-1;i++) {
			for(int j=1;j<a.length-1;j++) {
				System.out.print(a[i][j]+" ");
				sum =sum+a[i][j];
				c++;
			}
			System.out.println();
		}
System.out.println("sum of inner ele: "+sum);
System.out.println("count of inner ele: "+c);
int avg = sum/c;
System.out.println("Avg of inner ele: "+avg);
	}

}
