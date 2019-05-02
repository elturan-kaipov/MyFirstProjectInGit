package Arrays;

import java.util.Arrays;

public class Binary1 {
    public static void main(String[] args) {


        int decimal = 67;
        int[] binary =new int[8];
        for(int i=binary.length-1; i>=0; i--){
            binary[i]=decimal%2;
            decimal=decimal/2;
        }
        System.out.println(Arrays.toString(binary));

        int [] nums=new int[]{0,1,0,0,0,0,1,1};
        System.out.println(binary(nums));
        int number=67;
        int [] arr=decimal(number);
        System.out.println(Arrays.toString(arr));
    }

//    Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value
//    and print out to console. Feel free to use additional arrays or formulas.
//
//    Example:
//    binary -> [0, 0, 0, 0, 0, 0, 1, 1]
//    print 3
//
//    binary -> [0, 0, 1, 0, 0, 0, 1, 1]
//    print 35
//
//    binary -> [1, 1, 1, 1, 1, 1, 1, 1]
//    print 255
    public static int binary(int[] nums){
        int decimal=0;
        int [] binary={128, 64, 32, 16, 8, 4, 2,1};
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                nums[i]=binary[i];
            }
            decimal+=nums[i];
        }
        return decimal;
    }
    public static int[] decimal(int num){
        int [] binary={128, 64, 32, 16, 8,4,2,1};
        int [] arr=new int[8];
        for(int i=0; i<arr.length;i++){
            if(num>=binary[i]){
                arr[i]=1;
                num-=binary[i];
            }
        }
        return arr;
    }
}
