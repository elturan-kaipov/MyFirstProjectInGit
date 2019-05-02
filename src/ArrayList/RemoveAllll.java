package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllll {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(Arrays.asList("hi", "hello", "hi", "yo"));
        String word="hi";
        removeAll(words, word);
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(-7);
        nums.add(0);
        nums.add(20);
        nums.add(30);
        nums.add(-2);


        timesTwo(nums);
        System.out.println();
        System.out.println(appendPostSum(nums));


    }

    public static void removeAll(ArrayList<String> wordList, String wordA) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equalsIgnoreCase(wordA)) {
                wordList.remove(i);
                i--;
            }
        }
        System.out.println(wordList);
    }
    public static void timesTwo(ArrayList<Integer> nums){
        for(int i=0; i<nums.size(); i++){
            System.out.print(nums.get(i)*2+" ");
        }
    }

    public static ArrayList<Integer> appendPostSum(ArrayList<Integer> nums){
        ArrayList<Integer> newNums=new ArrayList<>();
        int sum=0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i)>0){
                newNums.add(nums.get(i));
                sum+=nums.get(i);
            }
        }
        newNums.add(sum);
        return newNums;
    }
}