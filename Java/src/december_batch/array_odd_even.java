package december_batch;
import java.util.Scanner;
public class array_odd_even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i,oddsum=0,evesum=0,oddmax,evemax;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("Enter array element:");
			arr[i]=sc.nextInt();
		}
		oddmax=arr[0];
		evemax=arr[0];
		System.out.println("odd numbers from array:");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
				oddsum=oddsum+arr[i];
				if(arr[i]>oddmax)
				{
					oddmax=arr[i];
				}
			}
		}
		
		System.out.println("Even numbers from array:");
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				evesum=evesum+arr[i];
				if(arr[i]>evemax)
				{
					evemax=arr[i];
				}
			}
		}
		System.out.println("Odd numbers sum="+oddsum);
		System.out.println("even numbers sum="+evesum);
		System.out.println("odd max="+oddmax);
		System.out.println("eve max="+evemax);

	}

}
