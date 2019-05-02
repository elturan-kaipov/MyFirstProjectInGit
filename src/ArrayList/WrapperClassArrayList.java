package ArrayList;

import java.util.ArrayList;

public class WrapperClassArrayList {
    public static void main(String[] args) {
        Integer n = 100;
        int n2 = 0;



        int number=new Integer("12");
        // Auto-unboxing


        int num2=new Integer("12");





        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        System.out.println(nums);
        System.out.println(nums.toString());


        for (Integer num : nums) {
            System.out.println(num);// 2 options
        }

        System.out.println("++++++++++++++++++");


        for (int num : nums) {
            System.out.println(num);
            n2 = n2 + num;
        }
        System.out.println(n2);


        for (int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println();
    }
}
