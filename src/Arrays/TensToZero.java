package Arrays;

public class TensToZero {
    public static void main(String[] args) {
        int[] nums={1,10,10,2};

        for(int i=0; i>nums.length; i++) {
            int num = 0;
            if (nums[i] == 10) {
                nums[i] = num;
                nums[i] = nums[nums.length - 1];
            }
        }


    }

}
