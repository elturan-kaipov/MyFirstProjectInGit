package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUpdates {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<>();
        nums.add(23);
        nums.add(32);
        nums.add(45);
        nums.add(900);

        System.out.println(nums);
        System.out.println();

        for(int k=0; k<nums.size(); k++){
            if(nums.get(k)>45){
                nums.remove(k);
                k=0;
            }
        }
        System.out.print(nums);
        System.out.println();
        System.out.println();

        nums.add(200);
        nums.add(500);
        nums.set(2, 100);
        System.out.println(nums);
        nums.set(1, nums.get(1)*20);
        System.out.println(nums);

        System.out.println(nums.indexOf(100));
        System.out.println(nums.set(2,3));
        System.out.println(nums);


        System.out.println();
        int largest=0;
        for(int i=0; i<nums.size();i++){
           // largest=nums.get(i);
            if(largest>nums.get(i)){
                largest=largest;
            }else if(largest<nums.get(i)){
                largest=nums.get(i);
            }
        }
        System.out.println(largest);
    }
}
