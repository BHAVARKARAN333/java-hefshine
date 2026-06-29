package december_batch;

public class arrya_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int array[][] = new int [][] {
//			
//			new int[] {21,22,23,24},
//			new int[] {21,22},
//			new int[] {21,22,23},
//			new int[] {21,22,23,24,25},
//		};
//		
//		for(int i = 0 ; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//			
		

        int i, j;
        int NUM;

        int arr[] = {4};

        System.out.println("Prime numbers in array:");

        for (i = 0; i < arr.length; i++) {

            NUM = 0; // 

            for (j = 2; j < arr[i] / 2; j++) {

                if (arr[i] % j == 0) {
                    NUM = 1;   
                    break;    
                }
            }

            if (NUM == 0 && arr[i] > 1) {
                System.out.println(arr[i]);
            }
        }
}
}