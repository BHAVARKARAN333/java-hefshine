package december_batch;

import java.util.Scanner;

public class array_2d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int arr[][] = new int[3][3];

      
        System.out.println("Enter 9 elements for 3x3 array:");

        for(int i = 0; i < arr.length; i++) {          
            for(int j = 0; j < arr[i].length; j++) {   
                arr[i][j] = sc.nextInt();
            }
        }

      
        System.out.println("3x3 Array is:");

        for(int i = 0; i < arr.length; i++) {          
            for(int j = 0; j < arr[i].length; j++) {   
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
