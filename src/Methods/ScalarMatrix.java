package Methods;

import java.util.Arrays;

public class ScalarMatrix {
    public static void main(String[] args) {
    int[][] matrix={
                   {2,5,10},
                   {1,2,3}

                    };
        System.out.print(Arrays.deepToString(scalarMatix(matrix, 5)));
        System.out.println();
        int[] nums={1,2,5,4};
        System.out.println(isSort(nums));
    }
    public static int[][] scalarMatix(int[][] matrix, int num){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]*=num;

            }

        }
        return matrix;
    }

    public static boolean isSort(int [] nums){
        boolean found=false;
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] > nums[i + 1]) {
                found=false;
                break;
            } else {
                found=true;
            }
        }
        return found;
    }
}
