package ForLoop;

import java.util.Arrays;

public class Task004 {
    public static void main(String[] args) {
        int[] nums={5,10};
        int start=nums[0];
        int end=nums[1];
        int [] arr=new int[end-start];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            arr[i]=start;
            start++;

        }
        System.out.println(Arrays.toString(arr));
    }
}