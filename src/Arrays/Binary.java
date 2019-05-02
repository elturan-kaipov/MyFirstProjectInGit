package Arrays;

import java.util.Arrays;

public class Binary {
    public static void main(String[] args) {
        int [] nums={23,4,5,6,8,1,34};
        for(int i=0; i<nums.length/2; i++){
            int temp=nums[i];
          nums[i]=nums[nums.length-(i+1)];
            //System.out.println(nums[i]);
            nums[nums.length-(i+1)]=temp;

        }
        //System.out.println(Arrays.toString(nums));
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}
