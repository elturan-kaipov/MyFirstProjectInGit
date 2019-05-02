package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(doswitch(nums)));

        ArrayList<Integer> num1=new ArrayList<>();
        num1.add(1);
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(1);
        num1.add(4);
        num1.add(5);
        System.out.println(remove(num1, 1));

        ArrayList<Integer>  arr = new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(11);
//        arr.add(2);
//        arr.add(6);
        int times = refuel_times(arr,10);
        System.out.print(times);

    }
    public static int[] doswitch(int[] nums){
        int temp=0;
        temp=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=temp;
        return nums;
    }

    public  static ArrayList<Integer> remove(ArrayList<Integer> nums, int num){

        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)==num){
                nums.remove(nums.get(i));
                i--;
            }
        }
        return nums;
    }
    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel){
        int sum =0;
        for(int i=0; i < deliveries.size(); i++) {
            sum+= deliveries.get(i);
        }
        if(sum % max_fuel == 0) {
            return sum/max_fuel;
        }else {
            return sum/max_fuel+1;

        }

    }
}
