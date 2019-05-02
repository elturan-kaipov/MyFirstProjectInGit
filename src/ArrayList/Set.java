package ArrayList;

import java.util.ArrayList;

public class Set {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(33);
        nums.add(23);
        nums.add(34);
        nums.add(45);
        nums.add(56);
        System.out.println(nums);
        nums.set(2,100);
        nums.set(0,200);
        System.out.println(nums);

        for(Integer num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
        int sumOfEvens=0;
        for(int i=0; i<nums.size();i++){
            if(nums.get(i)%2==0) {
                sumOfEvens+=nums.get(i);
                System.out.println(nums.get(i) + " ");

            }

        }
        System.out.println(sumOfEvens);

    }
}
