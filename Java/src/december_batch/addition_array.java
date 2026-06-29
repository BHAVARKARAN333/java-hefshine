package december_batch;

public class addition_array {

    public static void main(String[] args) {

        int arr[][] = {{1,6},{0,4}};

        int sum1 = 0, sum2 = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + "  ");

                if(j == 0)
                    sum1 += arr[i][j];

                if(j == 1)
                    sum2 += arr[i][j];
            }

            System.out.println();
        }

        System.out.println(sum1 + "  " + sum2);
    }
}
