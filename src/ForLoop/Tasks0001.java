package ForLoop;

import java.util.Arrays;

public class Tasks0001 {
    public static void main(String[] args) {
        int[] nums={1,10,10,2};
        int [] arr=new int[nums.length];
        System.out.println(Arrays.toString(arr));
        int p = 0;
        for(int i=0; i<nums.length; i++) {

            if (nums[i] != 10) {
                arr[p] = nums[i];
                p++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
