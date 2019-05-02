package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MethodWithList {
    public static void main(String[] args) {
    ArrayList<Integer> nums=new ArrayList<>();
    nums.add(12);
    nums.add(23);
    nums.add(43);
    ArrayList<Integer> myNums1=new ArrayList<>();
    myNums1.add(100);
    myNums1.add(200);
    myNums1.add(300);
    ArrayList<Integer> myNums2=new ArrayList<>(myNums1);
    myNums2.add(500);
    myNums2.add(900);
     int sumResult=sum2lists(myNums1, myNums2);
        System.out.println(sumResult);
        System.out.println();


   int result= sum(nums);
        System.out.println(result);
        System.out.println();
        System.out.println(buildIntList(20));
    }
    public static int sum(ArrayList<Integer> nums){
        int sum=0;
//        for(int n:nums){
//            sum+=n;
//        }
        for(int i=0; i<nums.size(); i++){
            sum+=nums.get(i);
        }
        return sum;
    }

    public static int sum2lists(ArrayList<Integer> num1, ArrayList<Integer> num2){
       int sum=0;
       for(Integer num:num1){
           sum+=num;
       }
        for(Integer n:num2){
            sum+=n;
        }
        return sum;
    }

    public static ArrayList<Integer> buildIntList(int nums){
        Random rand=new Random();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0; i<=nums; i++){
            list.add(rand.nextInt(101));
        }
        return list;
    }
}
